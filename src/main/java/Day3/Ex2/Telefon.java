package Day3.Ex2;

import java.util.Random;

public class Telefon implements Dzwoni {

    private String numerTelefonu;
    private int lacznyCzasRozmow;

    public Telefon(String numerTelefonu, int lacznyCzasRozmow) {
        this.numerTelefonu = numerTelefonu;
        this.lacznyCzasRozmow = 0;
    }

    public int getLacznyCzasRozmow() {
        return lacznyCzasRozmow;
    }

    @Override
    public void zadzwon(String numer) {
        Random random = new Random();
        int wylosowana = random.nextInt(10);
        if(wylosowana < 3){
            System.out.println("Nie udalo sie dodzwonic");
        }else {
            System.out.println("Dzownie na numer " + numerTelefonu);
            int czasRozmowy = random.nextInt(60) + 1;
            this.lacznyCzasRozmow  += czasRozmowy;
            System.out.println("Rozmawiałes tyle minut :" + czasRozmowy);
        }

    }

    @Override
    public void zadzwonNaNrAlarmowy() {
        zadzwon(Dzwoni.numerAlarmowy);
    }
}
