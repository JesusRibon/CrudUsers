package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDto, String> {




}
