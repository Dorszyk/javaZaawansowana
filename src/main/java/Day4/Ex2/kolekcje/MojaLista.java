package Day4.Ex2.kolekcje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MojaLista {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Ala");
        strings.add("Ala");
        strings.add("Ala");
        strings.add("ma");
        strings.add("kota");
        strings.add("kota");
        strings.add("kota");

        wyswietlZduplikowaneElementy(strings);
        usunZduplikowaneElemnty(strings);
        System.out.println(strings);
    }

    public static void wyswietlZduplikowaneElementy(List<String> lista) {
        List<String> duplicates = new ArrayList<>();
        for (String s : lista) {
            if (lista.indexOf(s) != lista.lastIndexOf(s)) {
                if (!duplicates.contains(s)) {
                    duplicates.add(s);
                }
            }
        }
        System.out.println(duplicates);
    }

    public static void usunZduplikowaneElemnty(List<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String omawiany = iterator.next();
            if(strings.indexOf(omawiany) != strings.lastIndexOf(omawiany)){
                iterator.remove();
            }
        }
        /*for (String s : strings) {
            while (strings.indexOf(s) != strings.indexOf(s)) {
                strings.remove(strings.lastIndexOf(s));
            }
        }*/
    }
}



