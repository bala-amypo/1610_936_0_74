package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.IdcardService;
import com.example.demo.entity.IdcardEntity;

@RestController
public class IdcardController{
    @Autowired  TimeStampService ser;

    @PostMapping("/posts")
    public TimeStampEntity sendData(@RequestBody TimeStampEntity ti){
       return ser.postData(ti);
    }
}