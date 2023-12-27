package ru.mts.HW_4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<Animal> findLeapYearNames(List<Animal> animals) {
        return animals.stream()
                .filter(animal -> animal.getBirthDay().isLeapYear())
                .collect(Collectors.toList());
    }

    @Override
    public List<Animal> findOlderAnimal(List<Animal> animals, int n) {
        return animals.stream().
                filter(animal -> animal.getBirthDay().until(LocalDate.now(), ChronoUnit.YEARS) > n)
                .collect(Collectors.toList());
    }

    @Override
    public void findDuplicate(List<Animal> animals) {
        Map<Animal, Integer> animalCountMap = new HashMap<>();

        for (Animal animal : animals) {
            animalCountMap.put(animal, animalCountMap.getOrDefault(animal, 0) + 1);
        }

        for (Map.Entry<Animal, Integer> entry : animalCountMap.entrySet()) {
            Animal animal = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                System.out.println("Животное " + animal + " встречается " + count + " раз(а).");
            }
        }


    }
}
