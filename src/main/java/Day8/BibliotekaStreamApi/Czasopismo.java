package Day8.BibliotekaStreamApi;

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

