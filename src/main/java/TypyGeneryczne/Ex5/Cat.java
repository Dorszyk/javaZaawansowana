package TypyGeneryczne.Ex5;

public class Cat extends Animal{

    private  int numberOfLife;

    public Cat(String name, int numberOfLife) {
        super(name);
        this.numberOfLife = numberOfLife;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", numberOfLife=" + numberOfLife +
                '}';
    }

}
