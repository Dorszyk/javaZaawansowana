package Day2.symulatorfarby.Zad2;

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
}
