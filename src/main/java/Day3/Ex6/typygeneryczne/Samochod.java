package Day3.Ex6.typygeneryczne;

import java.util.Objects;

public class Samochod{

    protected String marka ;
    protected String model ;
    protected String kolor;

    public Samochod(String marka, String model, String kolor) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }

    public String zmienKolor(String kolor) {
        return kolor;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Samochod)) return false;
        Samochod samochod = (Samochod) o;
        return Objects.equals(marka, samochod.marka)
                && Objects.equals(model, samochod.model)
                && Objects.equals(kolor, samochod.kolor);
    }



}
