package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.User;
import com.example.demo.domain.service.UserGetService;
import com.example.demo.infrastructure.dto.UserDto;
import com.example.demo.infrastructure.mapper.UserMapper;
import com.example.demo.infrastructure.repository.UserRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserGetAdapter implements UserGetService {
  private final UserRepository userRepository;
  private final UserMapper userMapper;


  @Override
  public User getUser(String documento) {
    Optional<UserDto> userDto = userRepository.findById(documento);
    return  userDto.map(userMapper::toUser).orElse(null);
  }
}
