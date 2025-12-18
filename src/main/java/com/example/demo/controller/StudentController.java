package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import java.util.List;

@RestController
public class StudentController{
    @Autowired  StudentService ser;

    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
       return ser.postData(stu);
    }
    @GetMapping("/get")
    public List<StudentEntity>getData(){
        return ser.getAllData();
    }


}