package Day2.Zad1.symulatorfarby.model;


public class Trapez extends Figura {

    private double a, b, h;

    public Trapez(double a, double b, double h) {
        if( a < 0){
            throw new IllegalArgumentException("Nie da się stworzyć trapezu z ujemnymi wartościami");
        }if(b < 0){
            throw new IllegalArgumentException("Nie da się stworzyć trapezu z ujemnymi wartościami");
        }if(h < 0){
            throw new IllegalArgumentException("Nie da się stworzyć trapezu z ujemnymną wysokością");

        }
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getSurface() {
        return (a + b) * h / 2;
    }
}
