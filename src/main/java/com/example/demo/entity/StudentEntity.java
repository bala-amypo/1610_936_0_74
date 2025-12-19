package com.example.demo.entity;
 
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String username;
private String password;
private String email;
private Date created;


// public void setId(Integer id){
//     this.id=id;
// }
// public void setUsername(String username){
//     this.username=username;
// }
// public void setPassword(String password){
//     this.password=password;
// }
// public void setEmail(String email){
//     this.email=email;
// }
// public void setCreated(Date created){
//     this.created=created;
// }
// public Integer getId(){
//     return id;
// }
// public String getUsername(){
//     return username;
// }
// public String getPassword(){
//     return password;
// }
// public String getEmail(){
//     return email;
// }
// public Date getCreated(){
//     return created;
// }
// public StudentEntity(){

// }
// public StudentEntity(Integer id,String username,String password,String email,Date created){
//     this.id=id;
//     this.username=username;
//     this.password=password;
//     this.email=email;
//     this.created=created;
// }
}
