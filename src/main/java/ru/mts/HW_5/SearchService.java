package ru.mts.HW_5;

import java.util.List;
import java.util.Map;

public interface SearchService {

    List<String> findLeapYearNames(List<Animal> animals);

    List<Animal> findOlderAnimal(List<Animal> animals, int n);

    Map<Animal, Integer> findDuplicate(List<Animal> animals);

    void printDuplicate(List<Animal> animals);
}
