package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.StuService;
import com.example.demo.entity.StuEntity;

@RestController
public class StuController{
    @Autowired  StuService ser;

    @PostMapping("/postss")
    public StuEntity sendData(@RequestBody StuEntity ti){
       return ser.postData(ti);
    }
    @GetMapping("/ge")
    public List<StuEntity>getData(){
        return ser.getAllData();
    }
}