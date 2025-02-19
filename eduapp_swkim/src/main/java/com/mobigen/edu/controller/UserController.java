package com.mobigen.edu.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobigen.edu.dto.UserDto;
import com.mobigen.edu.entity.User;
import com.mobigen.edu.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

  private final UserService userService;
  
  @GetMapping("/users")
  public List<User> getAllUsers() {
      return userService.getAllUsers();
  }

  @GetMapping("/user/{id}")
  public ResponseEntity<User> getUserById(@PathVariable String id) {
      System.out.println("------ userid :: " + id);
      User user = userService.getUserById(id);
      if (user == null) {
          return ResponseEntity.notFound().build();
      }
      return ResponseEntity.ok(user);
  }

  @PostMapping("/save")
  public User createUser(@RequestBody UserDto user) {
      return userService.createUser(user);
  }

  @PostMapping("/update")
  public User updateUser(@RequestBody UserDto user) {
      return userService.updateUser(user);
  }
}
