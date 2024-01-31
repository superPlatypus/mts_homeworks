package ru.mts.HW_5;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(String name, BigDecimal cost, String breed, LocalDate birthDay){
        this.name = name;
        this.cost = cost;
        this.breed = breed;
        this.birthDay = birthDay;
    }

    public Dog(String name, BigDecimal cost, String breed, String character, LocalDate birthday){
        this.name = name;
        this.cost = cost;
        this.breed = breed;
        this.character = character;
        this.birthDay = birthday;
    }
}
