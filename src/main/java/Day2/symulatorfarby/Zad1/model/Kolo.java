package Day2.symulatorfarby.Zad1.model;

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
