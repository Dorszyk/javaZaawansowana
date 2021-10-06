package Day2.Zad1.symulatorfarby.model;

public class Kolo extends Figura {

    private double radius;

    public Kolo(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius;
    }
}
