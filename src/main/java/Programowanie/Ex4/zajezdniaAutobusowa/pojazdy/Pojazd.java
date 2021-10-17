package Programowanie.Ex4.zajezdniaAutobusowa.pojazdy;

public class Pojazd {

    protected double predkoscMaksymalna;

    public Pojazd(double predkoscMaksymalna) {
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "predkoscMaksymalna=" + predkoscMaksymalna +
                '}';
    }
}
