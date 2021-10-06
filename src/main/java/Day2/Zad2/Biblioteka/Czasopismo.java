package Day2.Zad2.Biblioteka;

public class Czasopismo extends Egzemplarz {


    public Czasopismo(Autor autor, String tile) {
        super(autor, tile);
    }



    @Override
    public String toString() {
        return "Czasopismo{" +
                "autor=" + autor +
                ", tile='" + tile + '\'' +
                '}';
    }
}

