package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;


import jakarta.validation.Valid;


@RestController
public class  ValidationController{
    @Autowired   ValidationService ser;

    @PostMapping("/postted")
    public  ValidationEntity sendData(@Valid @RequestBody  ValidationEntity val ){
       return ser.postData(val);
    }
    @GetMapping("/getted/{id}")
      public ValidationEntity getStudentId(@PathVariable Long id ){
        return ser.getData(id);
      }
}
   