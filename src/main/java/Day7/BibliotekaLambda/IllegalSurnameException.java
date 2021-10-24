package Day7.BibliotekaLambda;

public class IllegalSurnameException extends IllegalArgumentException{

    public IllegalSurnameException(String surname){
        super("Niepoprawna wartość w nazwisku : " + surname);
    }


}
