package Day1.bilety;


import static Day1.bilety.Bilet.getOdpowiedniBilet;
import static Day1.bilety.Bilet.wyswietlWynik;

public class Main {

    public static void main(String[] args) {

        Bilet.NORMALNY_GODZINNY.wyswietlDaneOBilecie();
        Bilet.ULGOWY_GODZINNY.wyswietlDaneOBilecie();

        System.out.println();
        Bilet ulgowyGodzinny = Bilet.ULGOWY_GODZINNY;
        ulgowyGodzinny.wyswietlDaneOBilecie();

        Bilet normalnyCalodniowy = Bilet.NORMALNY_CALODNIOWY;
        normalnyCalodniowy.wyswietlDaneOBilecie();

        int wiek = 65;
        int czasJazdy = 155;
        double dostepnaKwota = 14.0;

        Bilet odpowiedniBilet = getOdpowiedniBilet(wiek, czasJazdy, dostepnaKwota);
        wyswietlWynik(odpowiedniBilet);

    }


}
