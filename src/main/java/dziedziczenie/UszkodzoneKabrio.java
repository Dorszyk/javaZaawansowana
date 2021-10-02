package dziedziczenie;

public class UszkodzoneKabrio extends Kabriolet{

    boolean czyDachOtwarty;

    public UszkodzoneKabrio(String kolor, String marka, String rocznik, int predkosc, boolean swiatla, boolean czyDachOtwarty, boolean czyDachOtwarty1) {
        super(kolor, marka, rocznik, predkosc, swiatla, czyDachOtwarty);
        this.czyDachOtwarty = true;
    }

    @Override
    public void schowajDach() {
        System.out.println("Sorry dach nie działa");
    }

    public void czyDachOtwarty() {
    }
}
