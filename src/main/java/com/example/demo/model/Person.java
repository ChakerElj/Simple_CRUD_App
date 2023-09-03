package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ville ;

}
