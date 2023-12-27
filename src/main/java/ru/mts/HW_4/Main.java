package ru.mts.HW_4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
        List<Animal> animals;
        System.out.println("Создание 10 животных по умолчанию:");
        animals = createAnimalService.createAnimals();
        animals.forEach(System.out::println);

        SearchService searchService = new SearchServiceImpl();
        System.out.println("\nДубликаты (считаем что животные одинаковые, если их порода одинаковая):");
        searchService.findDuplicate(animals);
        System.out.println("\nЖивотные, родивишиеся в високосный год:");
        searchService.findLeapYearNames(animals).forEach(System.out::println);
        System.out.println("\nЖивотные, старше 10 лет:");
        searchService.findOlderAnimal(animals,10).forEach(System.out::println);



    }
}
