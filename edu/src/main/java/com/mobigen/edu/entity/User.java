package com.mobigen.edu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
  @Id
  private String user_id;
  private String user_name;


  public void changeName (String user_name) {
    this.user_name = user_name;
  }

  @Builder
  public User(String user_id, String user_name) {
    this.user_id = user_id;
    this.user_name = user_name;
  }

}
