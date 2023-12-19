package ru.mts.HW_3;

import java.math.BigDecimal;

public abstract class AbstractAnimal implements Animal{
    protected String breed;
    protected String name;
    protected BigDecimal cost;
    protected String character;

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

    @Override
    public String toString() {
        return  this.getClass().getSimpleName()+ "{" +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", cost=" + getCost() +
                ", character='" + getCharacter() + '\'' +
                '}';
    }
}
