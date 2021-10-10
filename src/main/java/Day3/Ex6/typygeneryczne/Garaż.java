package Day3.Ex6.typygeneryczne;

public class Garaż<T> {

    private T one;
    private T two;

    public Garaż(T one, T two) {
        this.one = one;
        this.two = two;
    }

    public void zaparkuj(T something) {
        if (this.one == null) {
            this.one = something;
        } else if (this.two == null) {
            this.two = something;
        } else
            System.out.println("Garaż pełny, nie można zaparkować");

    }

    public T wyprowadz(T sthtoGetOut) {
        if (sthtoGetOut != null) {
            if (sthtoGetOut.equals(this.one)) {
                T temp = this.one;
                this.one = null;
                return this.one;
            } else if (sthtoGetOut.equals(this.two)) {
                T temp = this.two;
                this.two = null;
                return temp;
            } else {
                System.out.println(" No such object in a garage");
            }
        }else {
            System.out.println("I don't know what you want");
        }
        return sthtoGetOut;
    }
}
