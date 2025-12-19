package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStampEntity;

@RestController
public class TimeStampController{
    @Autowired  TimeStampService ser;

    @PostMapping("/post")
    public TimeStampEntity sendData(@RequestBody TimeStampEntity ti){
       return time.postData(ti);
    }
}