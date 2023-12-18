package ru.mts.HW_3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService{
    public void createTenAnimals(){
        int i = 0;
        do {
            createAnimal();
            i++;
        } while (i < 10);
    }

    public void createTenAnimals(int n){
        for (int i = 0; i  < n; i++){
            createAnimal();
        }
    }

}
