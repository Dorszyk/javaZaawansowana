package Programowanie.Ex1.autostrada;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


public class Autostrada {

    private Map<String, InformacjeOpojezdzie> mapaPojazdow = new HashMap<>();


    public void wjazdPojazduNaAutostradę(String numerRejestracyjny, TypPojazdu typPojazdu) {
        InformacjeOpojezdzie informacjeOPojezdzie = new InformacjeOpojezdzie(numerRejestracyjny, typPojazdu, LocalDateTime.now());
        mapaPojazdow.put(numerRejestracyjny, informacjeOPojezdzie);
        System.out.println("Pojazd: " + informacjeOPojezdzie + ", wjechał na autostradę.");
    }

    public InformacjeOpojezdzie znajdzPojazd(String numerRejestracyjny) {
        if (mapaPojazdow.containsKey(numerRejestracyjny)) {
            System.out.println("Pojazd wciąż znajduje się na autostradzie.");
            return mapaPojazdow.get(numerRejestracyjny);
        }
        throw new NieMoznaZnalezcPojazduException();
    }

    public Double wyjazdPojazdu(String numerRejestracyjny) {

        if (!mapaPojazdow.containsKey(numerRejestracyjny)) {
            throw new NieMoznaZnalezcPojazduException();
        }

        InformacjeOpojezdzie informacjeOPojezdzie = mapaPojazdow.get(numerRejestracyjny);

        Duration długośćPrzejazdu = Duration.between(informacjeOPojezdzie.getDataWjazdu(), LocalDateTime.now());

        double doZapłaty = 0.0;

        switch (informacjeOPojezdzie.getTypPojazdu()) {
            case OSOBOWY:
                doZapłaty = długośćPrzejazdu.getSeconds() * 0.01;
                break;
            case MOTOCYKL:
                doZapłaty = długośćPrzejazdu.getSeconds() * 0.02;
                break;
            case CIEZAROWY:
                doZapłaty = długośćPrzejazdu.getSeconds() * 0.05;
                break;
            case CIAGNIK:
                doZapłaty =długośćPrzejazdu.getSeconds() * 0.10;
        }

        mapaPojazdow.remove(numerRejestracyjny);
        System.out.println("Pojazd: " + numerRejestracyjny + " opuszcza autostradę, do zapłaty: " + doZapłaty);
        return doZapłaty;
    }


}


