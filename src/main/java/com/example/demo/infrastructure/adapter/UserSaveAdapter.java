package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.User;
import com.example.demo.domain.service.UserSaveService;
import com.example.demo.infrastructure.mapper.UserMapper;
import com.example.demo.infrastructure.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserSaveAdapter  implements UserSaveService {
  private final UserRepository userRepository;
  private final UserMapper userMapper;



  @Override
  public User saveUser(User user) {
    return userMapper.toUser(userRepository.save(userMapper.toUserDto(user)));
  }
}
