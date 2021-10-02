package Day1.superheroes;

public class SuperBohater {

    private  String nazwa;
    private  String supermoc;

    public SuperBohater(String nazwa, String supermoc) {
        this.nazwa = nazwa;
        this.supermoc = supermoc;
    }

    @Override
    public String toString() {
        return "Day1.superheroes.SuperBohater{" +
                "nazwa='" + nazwa + '\'' +
                ", supermoc='" + supermoc + '\'' +
                '}';
    }


}
