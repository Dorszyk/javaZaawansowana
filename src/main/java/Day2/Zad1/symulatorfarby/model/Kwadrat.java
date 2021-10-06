package Day2.Zad1.symulatorfarby.model;

public class Kwadrat extends Prostokat {


    public Kwadrat(double a) {
        super(a, a);
    }


    @Override
    public double getSurface() {
        return a * a;
    }
}
