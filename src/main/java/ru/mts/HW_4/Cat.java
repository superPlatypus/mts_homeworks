package ru.mts.HW_4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cat extends Pet {
    Cat(String name, BigDecimal cost, String breed, LocalDate birthDay){
        this.name = name;
        this.cost = cost;
        this.breed = breed;
        this.birthDay = birthDay;
    }

    Cat(String name, BigDecimal cost, String breed, String character, LocalDate birthday){
        this.name = name;
        this.cost = cost;
        this.breed = breed;
        this.character = character;
        this.birthDay = birthday;
    }

}
