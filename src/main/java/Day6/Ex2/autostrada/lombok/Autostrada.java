package Day6.Ex2.autostrada.lombok;

import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
@Data
public class Autostrada {
    private Map<String, InformacjeOpojezdzie> mapaPojazdow = new HashMap<>();

    public void wjazdPojazduNaAutostrade(String nrRej, TypPojazdu typPojazdu) {
        InformacjeOpojezdzie informacjeOpojezdzie = new InformacjeOpojezdzie(nrRej, typPojazdu, LocalDateTime.now());
        mapaPojazdow.put(nrRej, informacjeOpojezdzie);
        System.out.println("Pojazd: " + informacjeOpojezdzie + ", wjechał na autostradę");
    }

    public InformacjeOpojezdzie znajdzPojazd(String nrRej) {
        if (mapaPojazdow.containsKey(nrRej)) {
            System.out.println("Pojazd wciąż znajduje się na autostradzie");
            return mapaPojazdow.get(nrRej);
        }
        throw new NieMoznaOdszukacPojazdu();
    }

    public Double wyjazdPojazdu(String nrRej) {
        if (!mapaPojazdow.containsKey(nrRej)) {
            throw new NieMoznaOdszukacPojazdu();
        }

        InformacjeOpojezdzie informacjeOpojezdzie = mapaPojazdow.get(nrRej);
        Duration dlugoscPrzejazdu = Duration.between(informacjeOpojezdzie.getDataWjazdu(), LocalDateTime.now());
        double doZaplaty = 0.0;
        switch (informacjeOpojezdzie.getTypPojazdu()) {
            case OSOBOWY:
                doZaplaty = dlugoscPrzejazdu.getSeconds() * 0.02;
                break;
            case MOTOCYKL:
                doZaplaty = dlugoscPrzejazdu.getSeconds() * 0.01;
                break;
            case CIEZAROWY:
                doZaplaty = dlugoscPrzejazdu.getSeconds() * 0.03;
                break;
        }
        mapaPojazdow.remove(nrRej);
        System.out.println("Pojazd: " + nrRej + "opuszcza autostradę, do zapłaty : " + doZaplaty);
        return doZaplaty;
    }

}
