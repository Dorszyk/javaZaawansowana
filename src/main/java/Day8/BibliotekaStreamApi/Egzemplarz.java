package Day8.BibliotekaStreamApi;

public abstract class Egzemplarz {

    protected Autor autor;
    protected String tile;

    public Egzemplarz(Autor autor, String tile) {
        this.autor = autor;
        this.tile = tile;
    }

    public Autor getAutor() {
        return autor;
    }


    public String getTile() {
        return tile;
    }

    @Override
    public String toString() {
        return "Egzemplarz{" +
                "autor=" + autor +
                ", tile='" + tile + '\'' +
                '}';
    }
}
