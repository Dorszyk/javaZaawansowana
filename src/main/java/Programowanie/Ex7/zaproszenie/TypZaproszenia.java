package Programowanie.Ex7.zaproszenie;

public enum TypZaproszenia {

    POJEDYNCZE(1),
    Z_OS_TOWARZYSZACO(2);

    private int ileOsob;

    TypZaproszenia(int i) {
        this.ileOsob = i;

    }

    public int getIleOsob() {
        return ileOsob;
    }

}
