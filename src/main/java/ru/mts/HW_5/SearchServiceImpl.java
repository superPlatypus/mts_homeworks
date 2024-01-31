package ru.mts.HW_5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<String> findLeapYearNames(List<Animal> animals) {
        return animals.stream()
                .filter(animal -> animal.getBirthDay().isLeapYear())
                .map(Animal::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<Animal> findOlderAnimal(List<Animal> animals, int n) {
        return animals.stream().
                filter(animal -> animal.getBirthDay().until(LocalDate.now(), ChronoUnit.YEARS) > n)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Animal, Integer> findDuplicate(List<Animal> animals) {
        Map<Animal, Integer> animalCountMap = new HashMap<>();


        for (Animal animal : animals) {
            animalCountMap.put(animal, animalCountMap.getOrDefault(animal, 0) + 1);
        }

        return animalCountMap;

    }

    @Override
    public void printDuplicate(List<Animal> animals) {
        for (Map.Entry<Animal, Integer> entry : findDuplicate(animals).entrySet()) {
            Animal animal = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                System.out.println("Животное " + animal + " встречается " + count + " раз(а).");
            }

        }
    }
}
