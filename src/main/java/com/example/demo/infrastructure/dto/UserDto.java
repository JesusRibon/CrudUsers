package com.example.demo.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class UserDto {
  private String nombre;
  private String apellido;
  private String tipo;
  @Id
  private String documento;

}
