package Programowanie.Ex4.zajezdniaAutobusowa.zajezdnie;

import Programowanie.Ex4.zajezdniaAutobusowa.pojazdy.Pojazd;

import java.util.List;

public class Zajezdnia {
    protected String nazwa;
    List<Pojazd> listaPojazdow;

    public Zajezdnia(String nazwa) {
        this.nazwa = nazwa;

    }

    public void setListaPojazdow(List<Pojazd> listaPojazdow) {
        this.listaPojazdow = listaPojazdow;
    }

    @Override
    public String toString() {
        return "Zajezdnia{" +
                "nazwa='" + nazwa + '\'' +
                ", listaPojazdow=" + listaPojazdow +
                '}';
    }
}

