package Day2.Zad1.symulatorfarby.model;

public class Kwadrat extends Prostokat {


    public Kwadrat(double a) {
        super(a,a);

        if( a < 0) {
            throw new IllegalArgumentException("Nie da się stworzyć kwadratu z ujemnymi bokiem");
        }

    }


    @Override
    public double getSurface() {
        return a * a;
    }
}
