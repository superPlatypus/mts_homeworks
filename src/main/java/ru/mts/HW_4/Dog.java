package ru.mts.HW_4;

import java.math.BigDecimal;

public class Dog extends Pet {
    Dog(String name, BigDecimal cost){
        this.name = name;
        this.cost = cost;
        this.breed = "Some dog breed";
    }

    Dog(String name, BigDecimal cost, String breed, String character){
        this.name = name;
        this.cost = cost;
        this.breed = breed;
        this.character = character;
    }
}
