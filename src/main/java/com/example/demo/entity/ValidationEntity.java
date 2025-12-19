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

      
//    public void setId(Long id){
//       this.id=id;
//    }
//    public void setUsername(String username){
//       this.username=username;
//    }
//    public void setPassword(String password){
//       this.password=password;
//    }
//    public void setEmail(String email){
//       this.email=email;
//    }
//    public void setAge(int age){
//       this.age=age;
//    }

//    public Long getId(){
//        return id;
//    }
//    public String getUsername(){
//        return username;
//    }
//    public String getPassword(){
//        return password;
//    }
//    public String getEmail(){
//        return email;
//   }
//    public int getAge(){
//        return age;
//   }
//   public ValidationEntity(){

//   }
//   public ValidationEntity(Long id,
//           @NotNull @Size(min =2,max=6,message="must be 2 to 6 character") String username,
//           @Email(message ="Email is not valid") String email,
//           @Size(min=2 ,max=7,message="must be 2 to 7 character") @NotNull(message="Password is mandatory")
//           String password, @Min(18) @Positive(message="Age must be a positive number")  int age){
//         this.id=id;
//         this.username=username;
//         this.password=password;
//         this.email=email;
//         this.age=age;
//           }

          
}