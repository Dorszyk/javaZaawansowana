package Programowanie.Ex4.zajezdniaAutobusowa.pojazdy;

import Programowanie.Ex4.zajezdniaAutobusowa.zajezdnie.Zajezdnia;

public enum  IloscWagonow {
    JEDEN(1),
    DWA(2),
    TRZY(3);

    private int liczbaWagonow;

    public int getLiczbaWagonow() {
        return liczbaWagonow;
    }

    IloscWagonow(int liczba) {
        this.liczbaWagonow = liczba;
    }
}
