package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.StudentEntity;
public interface StudentService {
    List<StudentEntity>getAllData();
    StudentEntity postData(StudentEntity stu);
}