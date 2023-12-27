package ru.mts.HW_4;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * интерфейс для создания животных
 */
public interface CreateAnimalService {

    final static List<AnimalType> animalTypes = Arrays.asList(AnimalType.values());
    final static AnimalFactory animalFactory = new AnimalFactory();
    /**
     * Создание 10 животных
     */
    default List<Animal> createAnimals(){
        List<Animal> animals = new ArrayList<>();
        int i = 0;
        Random random = new Random();
        while (i < 10){
            AnimalType animalType = animalTypes.get(random.nextInt(4));
            animals.add(animalFactory.createAnimal(animalType));
            i++;
        }
        return animals;
    }

}
