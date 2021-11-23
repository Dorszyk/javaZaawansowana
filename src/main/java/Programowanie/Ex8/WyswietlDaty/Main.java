package Programowanie.Ex8.WyswietlDaty;

public class Main {
    public static void main(String[] args) {
        MojaData mojaData = new MojaData(11, 11, 2021);

        mojaData.wyswietlDate();
        mojaData.wyswietlDate2();
        mojaData.wyswietlDate3();


        MojaData mojaData1 = new MojaData(2, 5, 2000);

        mojaData1.wyswietlDate();
        mojaData1.wyswietlDate2();
        mojaData1.wyswietlDate3();
    }

}