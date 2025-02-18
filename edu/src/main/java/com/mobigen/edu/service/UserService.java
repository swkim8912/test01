package com.mobigen.edu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mobigen.edu.dto.UserDto;
import com.mobigen.edu.entity.User;
import com.mobigen.edu.registory.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
  
  private final UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(UserDto user) {
      return userRepository.save(user.toEntity());
    }

    public User updateUser(UserDto user) {
      User updateUser = userRepository.findById(user.getUser_id()).orElse(null);
      updateUser.changeName(user.getUser_name());
      return userRepository.saveAndFlush(user.toEntity());
    }
}
