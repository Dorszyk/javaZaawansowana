package Programowanie.Ex4.zajezdniaAutobusowa.pojazdy;

import Programowanie.Ex4.zajezdniaAutobusowa.zajezdnie.Zajezdnia;

public class Autobus extends  PojazdKomunikacjiMiejskiej{

    private double zuzytePaliwoWMiesiacu;

    public Autobus(double predkoscMaksymalna, int numer, Zajezdnia zajezdnia, double zuzytePaliwoWMiesiacu) {
        super(predkoscMaksymalna, numer, zajezdnia);
        this.zuzytePaliwoWMiesiacu = zuzytePaliwoWMiesiacu;
    }

    public double getZuzytePaliwoWMiesiacu() {
        return zuzytePaliwoWMiesiacu;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "zuzytePaliwoWMiesiacu=" + zuzytePaliwoWMiesiacu +
                ", predkoscMaksymalna=" + predkoscMaksymalna +
                ", numer=" + numer +
                '}';
    }
}
