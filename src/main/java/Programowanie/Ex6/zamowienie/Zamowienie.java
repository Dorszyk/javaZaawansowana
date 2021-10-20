package Programowanie.Ex6.zamowienie;

public class Zamowienie {

    private Pozycja[] pozycje;
    private int maksRozmiar;

    public Zamowienie() {
        maksRozmiar = 100;
        pozycje = new Pozycja[maksRozmiar];
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }

    public void dodajPozycje(Pozycja doDodania) {
        int count = 0;
        for (int i = 0; i < maksRozmiar; i++) {
            if (pozycje[i] != null) {
                count++;
            }
        }

        if (count == maksRozmiar) {
            System.out.println("Tablica pozycji pełna, nie możesz nic dodać");

        } else {
            for (int i = 0; i < maksRozmiar; i++) {
                if (pozycje[i] == null) {
                    pozycje[i] = doDodania;
                    break;
                }
            }
            System.out.println("Pomyśle dodano pozycję");
        }
    }

    public double obliczWartosc(){
        double suma = 0;
        for (int i = 0; i < maksRozmiar; i++) {
            if(pozycje[i] != null){
                suma += pozycje[i].obliczWartosc();
            }

        }
        return suma;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Zamówienie: \n");
        for (int i = 0; i < maksRozmiar; i++) {
            if(pozycje[i] != null){
                stringBuilder.append(pozycje[i].toString() + "\n");
            }

        }
        stringBuilder.append("Razem: " + obliczWartosc() + " zł");
        return stringBuilder.toString();
    }
}
