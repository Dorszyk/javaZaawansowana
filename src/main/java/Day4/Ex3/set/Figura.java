package Day4.Ex3.set;

public abstract class Figura implements Comparable<Figura> {

    public abstract double calculateArea();

    @Override
    public int compareTo(Figura o) {
        return Double.compare(this.calculateArea(),o.calculateArea());
    }
}
