package ru.mts.HW_3;

import java.math.BigDecimal;

public class Shark extends Predator{
    Shark(String name, BigDecimal cost){
        this.name = name;
        this.cost = cost;
        this.breed = "Some shark breed";
    }

    Shark(String name, BigDecimal cost, String breed, String character){
        this.name = name;
        this.cost = cost;
        this.breed = breed;
        this.character = character;
    }
}
