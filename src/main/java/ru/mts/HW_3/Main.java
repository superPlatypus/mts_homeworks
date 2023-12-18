package ru.mts.HW_3;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
        System.out.println("Создание 10 животных по умолчанию:");
        createAnimalService.createTenAnimals();
        System.out.println("\nСоздание 3 животных:");
        createAnimalService.createTenAnimals(3);
    }
}
