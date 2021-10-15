package TypyGeneryczne.Ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] tab = {10,21,33,40,50,60};
        ArrayUtils.swap(tab, 0,5);
        System.out.println(Arrays.toString(tab));
    }
}
