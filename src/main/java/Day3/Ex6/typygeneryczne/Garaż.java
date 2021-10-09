package Day3.Ex6.typygeneryczne;

public class Garaż<T> {

    private T auto1;
    private T auto2;

    public Garaż(T auto1, T auto2) {
        this.auto1 = auto1;
        this.auto2 = auto2;
    }

    public void zaparkuj(T auto){
        System.out.println("Auto zaparkowane");

    }
    public  T wyprowadz(T auto){
        System.out.println("Wyprowadz auto");
        return auto;

    }
}
