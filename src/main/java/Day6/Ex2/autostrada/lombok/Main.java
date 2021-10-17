package Day6.Ex2.autostrada.lombok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autostrada autostrada = new Autostrada();

        String wywolanie;
        do {
            System.out.println("Podaj komende");
            wywolanie = scanner.nextLine();

            String[] slowo = wywolanie.split(" ");

            if (slowo[0].equalsIgnoreCase("wjazd")) {
                if (slowo.length >= 3) {
                    String nrRej = slowo[1];
                    String slowoTypPojazdu = slowo[2];

                    try {
                        if (autostrada.znajdzPojazd(nrRej) != null) {
                            System.err.println("Taki pojazd już wjechał, drugi taki sam nie moze!");
                        }
                    } catch (NieMoznaOdszukacPojazdu e) {

                        try {
                            TypPojazdu typ = TypPojazdu.valueOf(slowoTypPojazdu.toUpperCase());
                            autostrada.wjazdPojazduNaAutostrade(nrRej, typ);
                        } catch (IllegalArgumentException iae) {
                            System.err.println("Błąd, zły typ pojazdu");
                        }
                    }
                }
            } else if (slowo[0].equalsIgnoreCase("wyjazd")) {

                if (slowo.length >= 2) {
                    String nrRej = slowo[1];
                    System.out.println(autostrada.wyjazdPojazdu(nrRej));

                }

            } else if (slowo[0].equalsIgnoreCase("sprawdz")) {

                if (slowo.length >= 2) {
                    String nrRej = slowo[1];
                    System.out.println(autostrada.znajdzPojazd(nrRej));
                }
            }

        }while (!wywolanie.equalsIgnoreCase("zakoncz")) ;
    }
}
