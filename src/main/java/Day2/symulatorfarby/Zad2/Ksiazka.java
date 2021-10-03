package Day2.symulatorfarby.Zad2;

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
