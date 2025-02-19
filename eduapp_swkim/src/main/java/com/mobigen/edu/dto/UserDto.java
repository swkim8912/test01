package com.mobigen.edu.dto;

import com.mobigen.edu.entity.User;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserDto {
  private String user_id;
  private String user_name;

  @Builder
  public UserDto(String user_id, String user_name) {
    this.user_id = user_id;
    this.user_name = user_name;
  }

  public User toEntity() {
    return User.builder()
            .user_id(user_id)
            .user_name(user_name).build();
  }
}
