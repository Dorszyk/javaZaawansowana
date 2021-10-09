package Day3.Ex3;

public class Pokarm {

    public String nazwa;
    public TypPokarmu typPokarmu;
    public float waga;

    public Pokarm(String nazwa, TypPokarmu typPokarmu, float waga) {
        this.nazwa = nazwa;
        this.typPokarmu = typPokarmu;
        this.waga = waga;
    }

    public String getNazwa() {
        return nazwa;
    }

    public TypPokarmu getTypPokarmu() {
        return typPokarmu;
    }

    public float getWaga() {
        return waga;
    }
}
