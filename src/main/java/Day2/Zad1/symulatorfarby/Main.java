package Day2.Zad1.symulatorfarby;
import Day2.Zad1.symulatorfarby.model.*;
import Day2.Zad1.symulatorfarby.service.SymulatorFarby;

public class Main {
    public static void main(String[] args) {

        Figura figuraOne = new Kolo(3);
        Figura figuraTwo = new Kwadrat( 4);
        Figura figuraThree = new Prostokat( 9,10);
        Figura figuraFour = new Trapez( 1,2,5);

        Figura[] figuras = new Figura[]{figuraOne,figuraTwo,figuraThree,figuraFour};

        System.out.println(SymulatorFarby.calculatePainDemand(figuras,10.0));

    }
}
