package Day1.dziedziczenie;

public class Mammal extends Animal{

    String spiecies;

    public Mammal(String name, int age) {
        super(name,age);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "spiecies='" + spiecies + '\'' +
                "} " + super.toString();
    }
}
