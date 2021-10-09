package Day3.Ex3;

public class Krokodyl implements Jedzacy {

    int ileZjadlPosilkow = 0;
    int ileZjadlGramow = 0;

    public int getIleZjadlPosilkow() {
        return ileZjadlPosilkow;
    }

    public int getIleZjadlGramow() {
        return ileZjadlGramow;
    }

    @Override
    public void jedz(Pokarm pokarm) {
        if (pokarm.getTypPokarmu() == TypPokarmu.MIĘSO) {
            System.out.println("Mniam mania" );
            ileZjadlPosilkow += 1;
            ileZjadlGramow += pokarm.waga;
        } else {
            System.out.println(" Nie jem tego");
        }
    }

    @Override
    public int ilePosilkowZjedzone() {
        return ileZjadlPosilkow;
    }

    @Override
    public int ileGramowZjedzone() {
        return ileZjadlGramow;
    }


}
