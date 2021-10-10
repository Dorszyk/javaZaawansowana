package Day4.Ex3.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Figura one = new Kwadrat(5);
        Figura one1 = new Kwadrat(10);
        Figura two = new Prostokat(5, 10);
        Figura two2 = new Prostokat(10, 20);
        Figura three = new Kwadrat(10);
        Figura three1 = new Prostokat(10, 20);

        Set<Figura> figuras = new HashSet<>();
        figuras.addAll(List.of(one, one1, two, two2, three, three1));

        System.out.println(figuras);


    }


}

