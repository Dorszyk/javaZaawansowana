package Programowanie.Ex2.komputer;

public class Main {
    public static void main(String[] args) {

        Komputer komputer1 = new Komputer(2000,"Dell",TypProcesora.WIELORDZENIOWY);
        Komputer komputer2 = new Komputer(1000,"HP",TypProcesora.JEDNORDZENIOWY);

        Laptop laptop1 = new Laptop(500,"HP",TypProcesora.WIELORDZENIOWY,21,false);
        Laptop laptop2 = new Laptop(200,"HP",TypProcesora.JEDNORDZENIOWY,15.1,true);

        Komputer[] tablicaKomputerow = new Komputer[]{komputer1,komputer2, laptop1,laptop2};

        int i = 0;

        while (i < tablicaKomputerow.length){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sprzęt w tablicy pod indeksem " + i+ ": \n"
                    + "Potrzebna moc: " + tablicaKomputerow[i].getPotrzebnaMoc() + " "
                    + "Producent: " + tablicaKomputerow[i].getPrducent() + " "
                    + "Typ: " + tablicaKomputerow [i].getTypProcesora());
            if(tablicaKomputerow[i] instanceof Laptop){
                stringBuilder.append(" Wielkość matrycy : " +
                        ((Laptop) tablicaKomputerow[i]).getWielkoscMatrycy());
            }
            System.out.println(stringBuilder.toString());
            i++;
        }

    }
}
