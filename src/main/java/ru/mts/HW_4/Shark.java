package ru.mts.HW_4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Shark extends Predator {
    public Shark(String name, BigDecimal cost, String breed, LocalDate birthDay){
        this.name = name;
        this.cost = cost;
        this.breed = breed;
        this.birthDay = birthDay;
    }

    public Shark(String name, BigDecimal cost, String breed, String character, LocalDate birthday){
        this.name = name;
        this.cost = cost;
        this.breed = breed;
        this.character = character;
        this.birthDay = birthday;
    }
}