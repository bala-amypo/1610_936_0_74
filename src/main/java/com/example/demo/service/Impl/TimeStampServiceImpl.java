package com.example.demo.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.TimeStampEntity;
import com.example.demo.repository.TimeStampRepo;
import com.example.demo.service.TimeStampService;


@Service
public class TimeStampServiceImpl implements TimeStampService{
      @Autowired TimeStampRepo time;

      @Override
      public TimeStampEntity postData(TimeStampEntity ti){
           return time.save(ti);
      }
}