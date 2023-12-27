package ru.mts.HW_4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AnimalFactory {
    final private static List<String> catBreeds = new ArrayList<>(Arrays.asList("Bengal", "British Shorthair", "Sphynx"));
    final private static List<String> dogBreeds = new ArrayList<>(Arrays.asList("Labrador", "German Shepherd", "Poodle"));
    final private static List<String> wolfBreeds = new ArrayList<>(Arrays.asList("Gray Wolf", "Red Wolf"));
    final private static List<String> sharkBreeds = new ArrayList<>(Arrays.asList("Whale Shark", "Tiger Shark"));

    public Animal createAnimal(AnimalType animalType){
        Animal animal = null;
        Random random = new Random();

        switch (animalType){
            case CAT:
                animal = new Cat("Cat" + random.nextInt(),
                                 BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP),
                                 catBreeds.get(random.nextInt(3)),
                                 getRandomDate());
                break;
            case DOG:
                animal = new Dog("Dog" + random.nextInt(),
                        BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP),
                        dogBreeds.get(random.nextInt(3)),
                        getRandomDate());
                break;
            case WOLF:
                animal = new Wolf("Wolf" + random.nextInt(),
                        BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP),
                        wolfBreeds.get(random.nextInt(2)),
                        getRandomDate());
                break;
            case SHARK:
                animal = new Shark("Shark" + random.nextInt(),
                        BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, RoundingMode.HALF_UP),
                        sharkBreeds.get(random.nextInt(2)),
                        getRandomDate());
                break;
        }

        return animal;
    }

    public static LocalDate getRandomDate() {
        Random random = new Random();
        int year = random.nextInt(24) + 2000;
        int month = random.nextInt(12) + 1;
        int day = random.nextInt(31) + 1; //
        return LocalDate.of(year, month, day);
    }
}
