package com.example.demo.repository;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TimeStampEntity;

@Repository
public interface TimeStampRepo extends JpaRepository<TimeStampEntity,Long>{
    
}