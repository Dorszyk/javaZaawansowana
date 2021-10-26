package TypyGeneryczne.Ex5;

import lombok.Data;

@Data

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }


}
