package Day1.dziedziczenie;

public class Hippo extends Mammal{

    String name = "Hipopotam";
    int age = 20;


    public Hippo(String name, int age){
        super(name,age);
    }


    @Override
    public String toString() {
        return "Hippo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                "} " ;
    }
}
