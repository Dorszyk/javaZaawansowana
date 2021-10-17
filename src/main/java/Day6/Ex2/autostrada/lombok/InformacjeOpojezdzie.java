package Day6.Ex2.autostrada.lombok;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InformacjeOpojezdzie {

    private String nrRej;
    private TypPojazdu typPojazdu;
    private LocalDateTime dataWjazdu;

    public InformacjeOpojezdzie(String nrRej, TypPojazdu typPojazdu, LocalDateTime dataWjazdu) {
        this.nrRej = nrRej;
        this.typPojazdu = typPojazdu;
        this.dataWjazdu = dataWjazdu;
    }
}
