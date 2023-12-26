package ru.mts.HW_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    public List<Animal> createAnimals(int n){
        List<Animal> animals = new ArrayList<>();
        int i = 0;
        Random random = new Random();
        while (i < n){
            AnimalType animalType = animalTypes.get(random.nextInt(4));
            animals.add(animalFactory.createAnimal(animalType));
            i++;
        }
        return animals;
    }
}
