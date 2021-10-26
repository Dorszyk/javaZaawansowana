package TypyGeneryczne.Ex5;

public class Dog extends Animal{

    private String favoriteFood;


    public Dog(String name, String favoriteFood) {
        super(name);
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }


}
