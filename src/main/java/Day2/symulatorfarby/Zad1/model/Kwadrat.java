package Day2.symulatorfarby.Zad1.model;

public class Kwadrat extends Prostokat {


    public Kwadrat(double a) {
        super(a, a);
    }


    @Override
    public double getSurface() {
        return a * a;
    }
}
