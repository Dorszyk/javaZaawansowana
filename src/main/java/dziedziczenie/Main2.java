package dziedziczenie;

public class Main2 {

    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Czerwony" ,"Opel","1999",80,true);

        System.out.println(samochod1);

        Kabriolet samochod3 = new Kabriolet("Zielony","Mercedes","2021",120,true,true);
        System.out.println(samochod3);

        UszkodzoneKabrio uszkodzoneKabrio = new UszkodzoneKabrio("Biały","Fiat","1968",20, true,true,true);
        uszkodzoneKabrio.schowajDach();

    }
}
