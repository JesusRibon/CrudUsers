package com.example.demo.domain.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

  private String nombre;
  private String apellido;
  private String tipo;
  @Id
  private String documento;


}
