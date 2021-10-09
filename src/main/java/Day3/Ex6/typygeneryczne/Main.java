package Day3.Ex6.typygeneryczne;

import Day3.Ex5.Student;

public class Main {
    public static void main(String[] args) {

        Samochod bmw = new BMW("X6","czerwony");
        Samochod porshe = new Porshe("911","czarny");

        Garaż<Samochod> garaz = new Garaż<>(bmw,porshe);
        System.out.println(garaz.wyprowadz(bmw));
        garaz.zaparkuj(porshe);

    }
}
