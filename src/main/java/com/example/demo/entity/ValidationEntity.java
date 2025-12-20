package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Positive;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationEntity{
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      private Long id;  // wrapper class so L  otherwise long

      @NotNull
      @Size(min =2,max=6,message="must be 2 to 6 character")
      private String username;

      @Email(message ="Email is not valid")
      private String email;

      @Size(min=2 ,max=7,message="must be 2 to 7 character")
      @NotNull(message="Password is mandatory")
      private String password;

      @Min(18)
      @Positive(message="Age must be a positive number") 
      private int age;
          
}