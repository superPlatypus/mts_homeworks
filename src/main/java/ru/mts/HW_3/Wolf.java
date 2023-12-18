package ru.mts.HW_3;

import java.math.BigDecimal;

public class Wolf extends Predator{
    Wolf(String name, BigDecimal cost){
        this.name = name;
        this.cost = cost;
        this.breed = "Some wolf breed";
    }
}
