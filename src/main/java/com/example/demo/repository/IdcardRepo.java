package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.IdcardEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{
    
}