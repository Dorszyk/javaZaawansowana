package Day4.Ex3.set;

import java.util.Objects;

public class Kwadrat extends Figura{

    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "a=" + a +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kwadrat)) return false;
        Kwadrat kwadrat = (Kwadrat) o;
        return Double.compare(kwadrat.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
