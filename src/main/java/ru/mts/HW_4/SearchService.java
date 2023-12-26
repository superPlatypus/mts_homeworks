package ru.mts.HW_4;

import java.util.List;

public interface SearchService {

    List<Animal> findLeapYearNames(List<Animal> animals);

    List<Animal> findOlderAnimal(List<Animal> animals, int n);

    void findDuplicate(List<Animal> animals);
}
