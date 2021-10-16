package Day2.Zad1.symulatorfarby.model;

public class Prostokat extends Figura {

    protected double a, b;

    public Prostokat(double a, double b) {
        if( a < 0){
            throw new IllegalArgumentException("Nie da się stworzyć prostokąta z ujemnymi bokami");
        }
        if( b < 0){
            throw new IllegalArgumentException("Nie da się stworzyć prostokąta z ujemnymi bokami");
        }

        this.a = a;
        this.b = b;
    }

    @Override
    public double getSurface() {
        return a * b;
    }
}
