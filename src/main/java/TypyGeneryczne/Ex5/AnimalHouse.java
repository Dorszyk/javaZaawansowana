package TypyGeneryczne.Ex5;

import lombok.Data;

@Data
public class AnimalHouse <T extends Animal>{

    T[] animals;

    public AnimalHouse(T[] animals) {
        this.animals = animals;
    }

}
