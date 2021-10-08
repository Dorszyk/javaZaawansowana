package Programowanie.Ex2.komputer;

public class Komputer {

    private int potrzebnaMoc;
    private String prducent;
    private  TypProcesora typProcesora;

    public Komputer(int potrzebnaMoc, String prducent, TypProcesora typProcesora) {
        this.potrzebnaMoc = potrzebnaMoc;
        this.prducent = prducent;
        this.typProcesora = typProcesora;
    }

    public int getPotrzebnaMoc() {
        return potrzebnaMoc;
    }

    public String getPrducent() {
        return prducent;
    }

    public TypProcesora getTypProcesora() {
        return typProcesora;
    }

}
