package Programowanie.Ex4.zajezdniaAutobusowa.pojazdy;

import Programowanie.Ex4.zajezdniaAutobusowa.zajezdnie.Zajezdnia;

public class Tramwaj extends PojazdKomunikacjiMiejskiej {

    private IloscWagonow iloscWagonow;

    public Tramwaj(double predkoscMaksymalna, int numer, Zajezdnia zajezdnia, IloscWagonow iloscWagonow) {
        super(predkoscMaksymalna, numer, zajezdnia);
        this.iloscWagonow = iloscWagonow;
    }

    public IloscWagonow getIloscWagonow() {
        return iloscWagonow;
    }

    @Override
    public String toString() {
        return "Tramwaj{" +
                "predkoscMaksymalna=" + predkoscMaksymalna +
                ", numer=" + numer +
                ", iloscWagonow=" + iloscWagonow +
                '}';
    }
}
