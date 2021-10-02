package Day1.bilety;

import Day1.bilety.Bilet;

public class Main {

    public static void main(String[] args) {

        Bilet.NORMALNY_GODZINNY.wyswietlDaneOBilecie();
        Bilet.ULGOWY_GODZINNY.wyswietlDaneOBilecie();

        Bilet ulgowyGodzinny = Bilet.ULGOWY_GODZINNY;
        ulgowyGodzinny.wyswietlDaneOBilecie();


    }


}
