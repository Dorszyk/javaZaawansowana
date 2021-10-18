package TypWyliczeniowy.Ex3;

public class Main {
    public static void main(String[] args) {



        float convertedTemp0 = TemperatureConvert.convertTemperature('C', 'F', 0);
        float convertedTemp1 = TemperatureConvert.convertTemperature('C', 'K', 0);
        float convertedTemp2 = TemperatureConvert.convertTemperature('K', 'C', 0);
        float convertedTemp3 = TemperatureConvert.convertTemperature('F', 'C', 0);
        float convertedTemp4 = TemperatureConvert.convertTemperature('F', 'K', 0);
        float convertedTemp5 = TemperatureConvert.convertTemperature('K', 'F', 0);

        System.out.println(convertedTemp0);
        System.out.println(convertedTemp1);
        System.out.println(convertedTemp2);
        System.out.println(convertedTemp3);
        System.out.println(convertedTemp4);
        System.out.println(convertedTemp5);


    }
}
