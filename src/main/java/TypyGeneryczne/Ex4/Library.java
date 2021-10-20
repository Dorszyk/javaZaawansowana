package TypyGeneryczne.Ex4;

import lombok.Data;

@Data
public class Library <T extends MediaConten>{

    private T[] elements;

    public Library(T[] elements) {
        this.elements = elements;
    }



}
