package Programowanie.Ex4.zajezdniaAutobusowa.zajezdnie;

import Programowanie.Ex4.zajezdniaAutobusowa.pojazdy.Pojazd;
import Programowanie.Ex4.zajezdniaAutobusowa.pojazdy.Tramwaj;

import java.util.List;

public class ZajezdniaTranwajowa extends Zajezdnia {


    public ZajezdniaTranwajowa(String nazwa) {
        super(nazwa);
    }

    @Override
    public String toString() {
        return super.toString() + ", sumaWagonow=" + sumaWagonow();
    }

    public int sumaWagonow() {
        int suma = 0;
        for (Pojazd pojazd : listaPojazdow) {
            Tramwaj temp = (Tramwaj) pojazd;
            suma += temp.getIloscWagonow().getLiczbaWagonow();
        }
        return suma;
    }
}


