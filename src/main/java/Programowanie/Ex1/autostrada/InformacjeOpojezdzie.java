package Programowanie.Ex1.autostrada;


import java.time.LocalDateTime;

public class InformacjeOpojezdzie {

    private String nrRej;
    private TypPojazdu typPojazdu;
    private LocalDateTime dataWjazdu;

    public InformacjeOpojezdzie(String nrRej, TypPojazdu typPojazdu, LocalDateTime dataWjazdu) {
        this.nrRej = nrRej;
        this.typPojazdu = typPojazdu;
        this.dataWjazdu = dataWjazdu;
    }

    public String getNrRej() {
        return nrRej;
    }

    public TypPojazdu getTypPojazdu() {
        return typPojazdu;
    }

    public LocalDateTime getDataWjazdu() {
        return dataWjazdu;
    }

    @Override
    public String toString() {
        return "InformacjeOpojezdzie{" +
                "nrRej='" + nrRej + '\'' +
                ", typPojazdu=" + typPojazdu +
                ", dataWjazdu=" + dataWjazdu +
                '}';
    }
}
