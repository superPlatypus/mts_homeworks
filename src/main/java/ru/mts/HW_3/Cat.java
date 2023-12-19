package ru.mts.HW_3;

import java.math.BigDecimal;

public class Cat extends Pet{
    Cat(String name, BigDecimal cost){
        this.name = name;
        this.cost = cost;
        this.breed = "Some cat breed";
    }

    Cat(String name, BigDecimal cost, String breed, String character){
        this.name = name;
        this.cost = cost;
        this.breed = breed;
        this.character = character;
    }

}
