package Day3.Ex6.typygeneryczne;

public class Main {
    public static void main(String[] args) {

        Samochod one = new BMW("X6","czerwony");
        Samochod two = new Porshe("911","czarny");
        Samochod three = new Porshe("911","czarny");

        Garaż<Samochod> garaz = new Garaż<>(one,two);


        System.out.println(garaz.wyprowadz(one));
        System.out.println(garaz.wyprowadz(one));
        System.out.println("###################");
        System.out.println(garaz.wyprowadz(three));




    }
}
