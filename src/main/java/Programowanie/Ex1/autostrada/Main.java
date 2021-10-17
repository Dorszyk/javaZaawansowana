package Programowanie.Ex1.autostrada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autostrada autostrada = new Autostrada();

        String komenda;
        do {
            System.out.println("Podaj komendę:");
            komenda = scanner.nextLine();

            String[] słowa = komenda.split(" ");


            if (słowa[0].equalsIgnoreCase("wjazd")) {
                if (słowa.length >= 3) {
                    String nrRej = słowa[1];
                    String slowoTypPojazdu = słowa[2];

                    try {
                        if (autostrada.znajdzPojazd(nrRej) != null) {
                            System.err.println("Taki pojazd juz wjechal, drugi taki sam nie moze!");
                        }
                    } catch (NieMoznaZnalezcPojazduException e) {

                        try {
                            TypPojazdu typ = TypPojazdu.valueOf(slowoTypPojazdu.toUpperCase());
                            autostrada.wjazdPojazduNaAutostradę(nrRej, typ);
                        } catch (IllegalArgumentException iae) {

                            System.err.println("Błąd, zły typ pojazdu.");
                        }
                    }
                }

            } else if (słowa[0].equalsIgnoreCase("wyjazd")) {

                    if (słowa.length >= 2) {
                        String nrRej = słowa[1];

                        System.out.println(autostrada.wyjazdPojazdu(nrRej));
                    }
            } else if (słowa[0].equalsIgnoreCase("sprawdz")) {

                    if (słowa.length >= 2) {
                        String nrRej = słowa[1];
                        System.out.println(autostrada.znajdzPojazd(nrRej));
                    }
                }

        }while (!komenda.equalsIgnoreCase("zamknij")) ;
    }
}


