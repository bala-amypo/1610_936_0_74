package com.example.demo.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.TimeStampEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;


@Service
public class TimeStampServiceImpl extends TimeStampService{
       @Autowired TimeStampRepo time;

      @Override
      public TimeStampEntity postData(TimeStampEntity ti){
           return time.save(ti);
      }
}