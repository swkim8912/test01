package com.mobigen.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
  
  @GetMapping("/hello")
  public String helloPage(Model model) {
      model.addAttribute("message", "Hello, Spring Boot with Thymeleaf!");
      return "hello";  // This should map to hello.html
  }
}
