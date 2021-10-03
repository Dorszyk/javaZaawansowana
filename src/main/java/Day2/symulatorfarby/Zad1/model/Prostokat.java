package Day2.symulatorfarby.Zad1.model;

public class Prostokat extends Figura {

    protected double a, b;

    public Prostokat(double a, double b) {

        this.a = a;
        this.b = b;
    }

    @Override
    public double getSurface() {
        return a * b;
    }
}
