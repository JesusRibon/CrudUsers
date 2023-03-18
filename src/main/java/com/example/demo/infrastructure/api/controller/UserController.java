package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.UserGet;
import com.example.demo.application.UserSave;
import com.example.demo.domain.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/user")
public class UserController {
  private final UserSave userSave;
  private final UserGet  userGet;



  @PostMapping
 public ResponseEntity<User> userSave(@RequestBody User user){
    return new  ResponseEntity<>(userSave.saveUser(user), HttpStatus.CREATED);

  }

  @GetMapping
  public ResponseEntity<User> userGet(@RequestParam String documento){
    System.out.printf(documento);
    return ResponseEntity.ok(userGet.getUser(documento));
  }


}
