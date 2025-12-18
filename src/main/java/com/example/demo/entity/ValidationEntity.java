package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotNull

@Entity
public class ValidationEntity{
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      private Long id;  // wrapper class so L  otherwise long

      @NotNull
      private String username;
      private String email;
      private String password;
      private int age;
}