package ru.mts.HW_3;

import java.math.BigDecimal;

public class Cat extends Pet{
    Cat(String name, BigDecimal cost){
        this.name = name;
        this.cost = cost;
        this.breed = "Some cat breed";
    }
}
