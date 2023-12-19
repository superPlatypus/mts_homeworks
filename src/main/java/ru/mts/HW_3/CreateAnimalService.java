package ru.mts.HW_3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * интерфейс для создания животных
 */
public interface CreateAnimalService {
    /**
     * Создание 10 животных
     */
    default void createTenAnimals(){
        int i = 0;
        while (i < 10){
            createAnimal();
            i++;
        }
    }

    /**
     * Создание одного случайного животного
     */
    default void createAnimal(){
        Random random = new Random();
        switch (random.nextInt(4)){
            case 0:{
                Dog dog = new Dog("Dog" + random.nextInt(), BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP));
                System.out.println(dog);
                break;
            }
            case 1:{
                Cat cat = new Cat("Cat" + random.nextInt(), BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP));
                System.out.println(cat);
                break;
            }
            case 2:{
                Wolf wolf = new Wolf("Wolf" + random.nextInt(), BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP));
                System.out.println(wolf);
                break;
            }
            case 3:{
                Shark shark = new Shark("Shark" + random.nextInt(), BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP));
                System.out.println(shark);
                break;
            }
        }
    }

    /**
     * Создание одного случайного животного c заданной породой и характером
     */
    default void createAnimalWithBreedAndCharacter(){
        final String BREED = "Some breed";
        final String CHARACTER = "Some character";

        Random random = new Random();
        switch (random.nextInt(4)){
            case 0:{
                Dog dog = new Dog("Dog" + random.nextInt(), BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP), BREED, CHARACTER);
                System.out.println(dog);
                break;
            }
            case 1:{
                Cat cat = new Cat("Cat" + random.nextInt(), BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP), BREED, CHARACTER);
                System.out.println(cat);
                break;
            }
            case 2:{
                Wolf wolf = new Wolf("Wolf" + random.nextInt(), BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP), BREED, CHARACTER);
                System.out.println(wolf);
                break;
            }
            case 3:{
                Shark shark = new Shark("Shark" + random.nextInt(), BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP), BREED, CHARACTER);
                System.out.println(shark);
                break;
            }
        }
    }
}
