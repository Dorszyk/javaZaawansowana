package Day4.Ex4.Lotto;

import java.util.HashMap;
import java.util.Map;


public class MapaTest {

    public static void main(String[] args) {

        String imie;
        int wiek;

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put("Ala", 1);
        stringIntegerMap.put("ma", 100);
        stringIntegerMap.put("kota", 1000);
        System.out.println(stringIntegerMap);

        stringIntegerMap.put("Ala", -1);

        System.out.println(stringIntegerMap);

        for (String key : stringIntegerMap.keySet()) {
            System.out.println("key: " + key + ",value: " + stringIntegerMap.get(key));
        }

        for (Map.Entry<String,Integer>pair : stringIntegerMap.entrySet()) {
            System.out.println(pair);
        }


    }


}

