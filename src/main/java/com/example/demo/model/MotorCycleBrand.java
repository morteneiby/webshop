package com.example.demo.model;

import javax.persistence.*;

@Entity
public class MotorCycleBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    @ManyToOne
    MotorCycleData motorCycleData;
}
