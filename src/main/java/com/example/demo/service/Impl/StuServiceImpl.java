package com.example.demo.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.StuEntity;
import com.example.demo.repository.StuRepo;
import com.example.demo.service.StuService;


@Service
public class StuServiceImpl implements StuTimeStampService{
      @Autowired StuRepo time;

      @Override
      public StuEntity postData(StuEntity ti){
           return time.save(ti);
      }
}