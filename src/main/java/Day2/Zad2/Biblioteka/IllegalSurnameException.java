package Day2.Zad2.Biblioteka;

public class IllegalSurnameException extends IllegalArgumentException{

    public IllegalSurnameException(){
        super("Niepoprawna wartość w nazwisku");
    }
    public IllegalSurnameException(String surname){
        super("Niepoprawna wartość w nazwisku : " + surname);
    }


}
