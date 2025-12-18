package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
public interface StudentService {
    List<StudentEntity>getAllData();
    StudentEntity postData(StudentEntity stu);
}