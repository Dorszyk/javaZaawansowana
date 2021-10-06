package Day2.Zad1.symulatorfarby.service;

import Day2.Zad1.symulatorfarby.model.Figura;

public class SymulatorFarby {

    public static double calculatePainDemand(Figura[] figuras, double canCapacity){
        double currentSum = 0;
        for (Figura figura : figuras) {
            currentSum += figura.getSurface();

        }
        return Math.ceil(currentSum/canCapacity);

    }
}
