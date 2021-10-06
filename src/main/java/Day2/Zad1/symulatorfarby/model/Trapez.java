package Day2.Zad1.symulatorfarby.model;


public class Trapez extends Figura {

    private double a, b, h;

    public Trapez(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getSurface() {
        return (a + b) * h / 2;
    }
}
