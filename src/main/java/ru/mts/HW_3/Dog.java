package ru.mts.HW_3;

import java.math.BigDecimal;

public class Dog extends Pet{
    Dog(String name, BigDecimal cost){
        this.name = name;
        this.cost = cost;
        this.breed = "Some dog breed";
    }
}
