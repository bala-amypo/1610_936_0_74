package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.PostStampService;
import com.example.demo.entity.PostStampEntity;

@RestController
public class TimeStampController{
    @Autowired  TimeStampService ser;

    @PostMapping("/post")
    public PostStampEntity sendData(@RequestBody PostStampEntity ti){
       return time.postData(ti);
    }
}