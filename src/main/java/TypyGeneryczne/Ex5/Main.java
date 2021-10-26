package TypyGeneryczne.Ex5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animal = {new Cat("Rysiek",4),new Dog("Azor","Kluski Sląskie")};

        AnimalHouse<Animal> animals = new AnimalHouse<>(animal);

        System.out.println(Arrays.toString(animals.getAnimals()));
    }
}
