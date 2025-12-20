package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;



import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdcardEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private int card_no;
  
    @OneToOne
    @JoinColumn(name="student_id")
    private StuEntity student;
}