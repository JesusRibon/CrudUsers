package com.example.demo.application;

import com.example.demo.domain.entities.User;
import com.example.demo.domain.service.UserGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserGet {
  private final UserGetService userGetService;

  public User getUser(String documento){
    return userGetService.getUser(documento);
  }

}
