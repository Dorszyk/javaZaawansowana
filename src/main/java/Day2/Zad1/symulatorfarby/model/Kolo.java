package Day2.Zad1.symulatorfarby.model;

public class Kolo extends Figura {

    private double radius;

    public Kolo(double radius) {
        if( radius < 0){
            throw new IllegalArgumentException("Nie da się stworzyć okręgu z ujemnym promieniem");
        }
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius;
    }
}
