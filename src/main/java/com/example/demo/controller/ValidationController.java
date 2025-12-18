package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;


@RestController
public class  ValidationController{
    @Autowired   ValidationService ser;

    @PostMapping("/postted")
    public  ValidationEntity sendData(@Valid @RequestBody  ValidationEntity stu){
       return ser.postData(stu);
    }
}
   