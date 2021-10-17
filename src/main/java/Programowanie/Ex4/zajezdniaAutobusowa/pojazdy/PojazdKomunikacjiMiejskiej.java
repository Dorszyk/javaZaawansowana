package Programowanie.Ex4.zajezdniaAutobusowa.pojazdy;

import Programowanie.Ex4.zajezdniaAutobusowa.zajezdnie.Zajezdnia;

public class PojazdKomunikacjiMiejskiej extends Pojazd{

    protected int numer;
    protected Zajezdnia zajezdnia;

    public PojazdKomunikacjiMiejskiej(double predkoscMaksymalna, int numer, Zajezdnia zajezdnia) {
        super(predkoscMaksymalna);
        this.numer = numer;
        this.zajezdnia = zajezdnia;
    }

    @Override
    public String toString() {
        return "PojazdKomunikacjiMiejskiej{" +
                "predkoscMaksymalna=" + predkoscMaksymalna +
                ", zajezdnia=" + zajezdnia +
                '}';
    }
}
