package com.example.demo.repository;

import org.springframework.sterotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.
@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{
    
}