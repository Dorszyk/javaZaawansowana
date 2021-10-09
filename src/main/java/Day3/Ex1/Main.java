package Day3.Ex1;

public class Main {
    public static void main(String[] args) {

        Instrumentalny bebenek = new Beben();
        Instrumentalny pianino = new Pianino();
        Instrumentalny gitara = new Gitara();

        bebenek.graj();
        pianino.graj();
        gitara.graj();
    }
}
