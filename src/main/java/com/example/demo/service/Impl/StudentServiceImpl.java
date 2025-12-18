package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{
    
}



package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.StudentEntity;
public interface StudentService {
    
    StudentEntity postData(StudentEntity stu); //post

    List<StudentEntity>getAllData(); //get

    String DeleteData(int id); //delete
  
    StudentEntity getData(int id); //findById

    StudentEntity putData(int id,StudentEntity stu); //put

}





package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{
       @Autowired StudentRepo student;
       //use save(),findAll(),findById(),deleteById(),existById();

      @Override
      public StudentEntity postData(StudentEntity stu){
           return student.save(stu);
      }
      @Override
      public List<StudentEntity>getAllData(){
           return student.findAll();
      }
      @Override
      public String DeleteData(int id){
              student.deleteById(id);
              return "Deleted Successfuly";

      }
      @Override
      public StudentEntity getData(int id){
        return student.findById(id).orElse(null);
      }
      @Override
      public StudentEntity putData(int id,StudentEntity stu){
         if(student.existsById(id)){
            stu.setId(id);
            return student.save(stu);
         }
         return null;
      }

}