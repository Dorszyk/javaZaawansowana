package Day2.Zad2.Biblioteka;

public class Ksiazka extends Egzemplarz{


    public Ksiazka(Autor autor, String tile) {
        super(autor, tile);
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "autor=" + autor +
                ", tile='" + tile + '\'' +
                '}';
    }
}
