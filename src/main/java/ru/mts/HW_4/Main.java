package ru.mts.HW_4;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
        System.out.println("Создание 10 животных по умолчанию:");
        createAnimalService.createTenAnimals();
        System.out.println("\nСоздание 3 животных с заданными породой и характером:");
        createAnimalService.createTenAnimals(3);
    }
}
