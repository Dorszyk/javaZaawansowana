package Day3.Ex2;

public class Main {
    public static void main(String[] args) {

        Telefon telefon = new Telefon("123321",1);

        Dzwoni aparat = new Telefon("123123",2);

        telefon.zadzwon("222");
        telefon.zadzwon("222");
        telefon.zadzwon("222");
        telefon.zadzwon("222");
        telefon.zadzwon("222");
        telefon.zadzwon("222");
        telefon.zadzwon("222");
        telefon.zadzwonNaNrAlarmowy();

        System.out.println(telefon.getLacznyCzasRozmow() ) ;

    }
}
