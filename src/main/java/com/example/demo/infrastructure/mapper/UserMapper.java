package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.User;
import com.example.demo.infrastructure.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring")
public interface UserMapper {
  UserDto toUserDto(User user);
  User toUser(UserDto userDto);


}
