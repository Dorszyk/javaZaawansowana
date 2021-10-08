package Programowanie.Ex2.komputer;

public class Laptop extends Komputer{

    private double wielkoscMatrycy;
    private boolean czyPosiadaRetine;



    public Laptop(int potrzebnaMoc, String prducent, TypProcesora typProcesora, double wielkoscMatrycy, boolean czyPosiadaRetine) {
        super(potrzebnaMoc, prducent, typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.czyPosiadaRetine = czyPosiadaRetine;
    }

    public double getWielkoscMatrycy() {
        return wielkoscMatrycy;
    }

    public boolean isCzyPosiadaRetine() {
        return czyPosiadaRetine;
    }
}
