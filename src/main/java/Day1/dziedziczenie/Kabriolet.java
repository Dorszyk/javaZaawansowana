package Day1.dziedziczenie;

public class Kabriolet extends Samochod {

    protected boolean czyDachOtwarty;



    @Override
    public void przyspiesz(){
        if (this.predkosc + 10 >= 180) {
            this.predkosc = 120;
        } else {
            this.predkosc += 20;
        }
        System.out.println("Przyspieszam do " + this.predkosc + " km/h.");
    }

    public Kabriolet(String kolor, String marka, String rocznik, int predkosc, boolean swiatla, boolean czyDachOtwarty) {
        super(kolor, marka, rocznik, predkosc, swiatla);
        this.czyDachOtwarty = isCzyDachOtwarty();

    }
    public void schowajDach() {
        this.czyDachOtwarty = false;
    }

    public boolean czyDachSchowany() {
        return this.czyDachOtwarty;

    }
    public boolean isCzyDachOtwarty(){
        return this.czyDachOtwarty;
    }


    @Override
    public String toString() {
        return "Kabriolet{" +
                "czyDachOtwarty=" + czyDachOtwarty +
                ", kolor='" + kolor + '\'' +
                ", marka='" + marka + '\'' +
                ", rocznik='" + rocznik + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }
}
