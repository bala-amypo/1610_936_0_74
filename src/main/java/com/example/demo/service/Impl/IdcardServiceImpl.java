package com.example.demo.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.IdcardEntity;
import com.example.demo.repository.IdcardRepo;
import com.example.demo.service.IdcardService;


@Service
public class IdcardServiceImpl implements IdcardService{
      @Autowired IdcardRepo time;

      @Override
      public IdcardEntity postData(TimeStampEntity ti){
           return time.save(ti);
      }
}