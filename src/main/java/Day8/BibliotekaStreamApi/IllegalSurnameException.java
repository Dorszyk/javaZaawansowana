package Day8.BibliotekaStreamApi;

public class IllegalSurnameException extends IllegalArgumentException{

    public IllegalSurnameException(String surname){
        super("Niepoprawna wartość w nazwisku : " + surname);
    }


}
