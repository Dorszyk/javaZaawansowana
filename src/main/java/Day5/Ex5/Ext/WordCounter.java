package Day5.Ex5.Ext;

import java.util.*;

public class WordCounter {

    public static Map<String, Integer> countWord(String tekst) {

        String[] strings = tekst.toLowerCase().replaceAll("[.,;]", "").split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        return map;
    }

    public static Map<String, Integer> sortowanieMapyMalejaco(Map<String, Integer> mapToSort) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mapToSort.entrySet());

        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

}
