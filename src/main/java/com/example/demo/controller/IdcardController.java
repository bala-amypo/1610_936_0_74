package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.IdcardService;
import com.example.demo.entity.IdcardEntity;

@RestController
public class IdcardController{
    @Autowired  IdcardService ser;

    @PostMapping("/po")
    public IdcardEntity sendData(@RequestBody IdcardEntity ti){
       return ser.postData(ti);
    }
    @GetMapping("/g")
    public List<IdcardEntity>getData(){
        return ser.getAllData();
    }
}