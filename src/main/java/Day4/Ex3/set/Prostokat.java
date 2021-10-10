package Day4.Ex3.set;

import java.util.Objects;

public class Prostokat extends Figura{

    double a;
    double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prostokat)) return false;
        Prostokat prostokat = (Prostokat) o;
        return Double.compare(prostokat.a, a) == 0 && Double.compare(prostokat.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
