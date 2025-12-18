package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;


@Entity
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
      private int age;

      
   public void setId(Long id){
      this.id=id;
}
   public void setUsername(String username){
      this.username=username;
   }
   public void setPassword(String password){
      this.password=password;
   }
   public void setEmail(String email){
      this.email=email;
   }
   public void setAge(int age){
      this.age=age;
   }

      public Integer getId(){
    return id;
}
public String getUsername(){
    return username;
}
public String getPassword(){
    return password;
}
public String getEmail(){
    return email;
}
public Date getCreated(){
    return created;
}
}