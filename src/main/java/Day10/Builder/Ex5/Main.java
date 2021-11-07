package Day10.Builder.Ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList(List.of("kjhgf","oiuy"));



        Dog goldDog = new Dog.DogBuilder()
                .age(2)
                .name("Pimpek")
                .toys(list)
                .type("Pasterski")
                .build();

        System.out.println(goldDog);
    }

}
