package ru.mts.HW_4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected BigDecimal cost;
    protected String character;
    protected LocalDate birthDay;

    @Override
    public LocalDate getBirthDay(){
        return this.birthDay;
    }

    @Override
    public String getBreed() {
        return this.breed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getCost() {
        return this.cost;
    }

    @Override
    public String getCharacter() {
        return this.character;
    }

//    @Override
//    public String toString() {
//        return  this.getClass().getSimpleName()+ "{" +
//                "breed='" + getBreed() + '\'' +
//                ", name='" + getName() + '\'' +
//                ", cost=" + getCost() +
//                ", character='" + getCharacter() + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return  this.getClass().getSimpleName()+ "{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAnimal that = (AbstractAnimal) o;
        return Objects.equals(breed, that.breed); // считаем что животные одинаковые, если у них одинаковая порода
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }
}
