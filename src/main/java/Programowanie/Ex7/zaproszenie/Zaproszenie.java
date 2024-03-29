package Programowanie.Ex7.zaproszenie;

import lombok.Data;

@Data
public class Zaproszenie {

    private String imie;
    private String nazwisko;
    TypZaproszenia typZaproszenia;

    public Zaproszenie(String imie, String nazwisko, TypZaproszenia typZaproszenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.typZaproszenia = typZaproszenia;
    }

    @Override
    public String toString() {
        if (typZaproszenia == TypZaproszenia.POJEDYNCZE) {
            return "\n" + "Gość " + imie + " " + nazwisko + "\n" + "Zaproszenie pojedyncze";
        }else {
            return "\n" + "Gość " + imie + " " + nazwisko + "\n" + "Zaproszenie z osobą towarzyszącą";
        }
    }
}
