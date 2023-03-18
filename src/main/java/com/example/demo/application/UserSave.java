package com.example.demo.application;

import com.example.demo.domain.entities.User;
import com.example.demo.domain.service.UserGetService;
import com.example.demo.domain.service.UserSaveService;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class UserSave {

  private final UserSaveService userSaveService;


  public User saveUser(User user) {

    return userSaveService.saveUser(user);
  }
}
