package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class MotorCycleData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private String engine;
    private String color;
    private int drivenKm;
    private String engineNumber;
    private String chassisNumber;
    private String year;
    private String price;

    @OneToMany(mappedBy = "motorCycleData")
    List<MotorCycleBrand> motorCycleBrands;




}
