package ru.mts.HW_4;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    public void createTenAnimals(){
        int i = 0;
        do {
            createAnimal();
            i++;
        } while (i < 10);
    }

    public void createTenAnimals(int n){
        for (int i = 0; i  < n; i++){
            createAnimalWithBreedAndCharacter();
        }
    }

}
