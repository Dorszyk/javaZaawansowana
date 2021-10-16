package Day5.Adnotacje;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        TeddyBear tb = new TeddyBear(10,"Misio");

        try {
            tb.setName("Misio");

        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
