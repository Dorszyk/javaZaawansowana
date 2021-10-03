package Day2.symulatorfarby.Zad1;

import Day2.symulatorfarby.Zad1.model.*;
import Day2.symulatorfarby.Zad1.service.SymulatorFarby;

public class Main {
    public static void main(String[] args) {

        Figura figuraOne = new Kolo(5);
        Figura figuraTwo = new Kwadrat( 5);
        Figura figuraThree = new Prostokat( 5,10);
        Figura figuraFour = new Trapez( 1,2,5);

        Figura[] figuras = new Figura[]{figuraOne,figuraTwo,figuraThree,figuraFour};

        System.out.println(SymulatorFarby.calculatePainDemand(figuras,10.0));



    }
}
