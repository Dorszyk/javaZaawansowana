package Day10.Builder.Ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        var list = new ArrayList(List.of("piłka", "gryzak"));
        List<String> list2 = new ArrayList(List.of("Zabawka"));

        Dog goldDog = new Dog.DogBuilder()
                .age(2)
                .name("Pimpek")
                .toys(list)
                .type("Pasterski")
                .build();

        System.out.println(goldDog);

        Dog silverDog = new Dog.DogBuilder()
                .age(2)
                .name("Groźny")
                .toys(list2)
                .type("Zabójca")
                .build();

        System.out.println(silverDog);
    }
}


