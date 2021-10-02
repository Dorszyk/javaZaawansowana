package Day1.dziedziczenie;

import java.util.Objects;

public class Samochod {

    protected String kolor;
    protected String marka;
    protected String rocznik;
    protected int predkosc;
    private boolean swiatla;


    public Samochod(String kolor, String marka, String rocznik, int predkosc, boolean swiatla) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
        this.predkosc = predkosc;
        this.swiatla = swiatla;
    }

    public void przyspiesz(){
        if (this.predkosc + 10 >= 120) {
            this.predkosc = 120;
        } else {
            this.predkosc += 10;
        }
        System.out.println("Przyspieszam do " + this.predkosc + " km/h.");
    }

    public int getPredkosc() {
        return predkosc + 10;
    }

    public boolean isSwiatla() {
        return swiatla;
    }

    public void wlaczSwiatla() {
        this.swiatla = true;

    }

    public boolean czySwiatlaWlaczone() {
        return true;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "kolor='" + kolor + '\'' +
                ", marka='" + marka + '\'' +
                ", rocznik='" + rocznik + '\'' +
                ", predkosc=" + predkosc +
                ", swiatla=" + swiatla +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samochod samochod = (Samochod) o;
        return predkosc == samochod.predkosc
                && swiatla == samochod.swiatla
                && Objects.equals(kolor, samochod.kolor)
                && Objects.equals(marka, samochod.marka)
                && Objects.equals(rocznik, samochod.rocznik);
    }

}

