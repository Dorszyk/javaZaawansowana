package Programowanie.Ex6.zamowienie;

public class Main {
    public static void main(String[] args) {


        Zamowienie zamowienie = new Zamowienie();

        Pozycja pozycja0 = new Pozycja("Chleb", 2, 3.5);
        Pozycja pozycja1 = new Pozycja("Wino", 1, 79);
        Pozycja pozycja2 = new Pozycja("Oliwki", 2, 7);
        Pozycja pozycja3 = new Pozycja("Kabanosy", 100, 2.5);

        zamowienie.dodajPozycje(pozycja0);
        zamowienie.dodajPozycje(pozycja1);
        zamowienie.dodajPozycje(pozycja2);
        zamowienie.dodajPozycje(pozycja3);

        System.out.println(zamowienie);


    }
}