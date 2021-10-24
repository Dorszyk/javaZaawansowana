package Day8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokazStreamAPI {
    public static void main(String[] args) {


        List<String> strings = Arrays.asList("Ala", "ma", "ma", "kota");
        Stream<String> stringStream = strings.stream();

        stringStream = stringStream
                .filter((slowo) -> slowo.charAt(0) == slowo.toUpperCase(Locale.ROOT).charAt(0));

        stringStream = stringStream.map(String::toUpperCase);
        Set<String> stringSet = stringStream.collect(Collectors.toSet());
        System.out.println(stringSet);


        List<String> strings1 = Arrays.asList("Piotrek", "ma", "ma", "kota");
        Set<String> stringSet1 = strings.stream()
                .filter((slowo) -> slowo.charAt(0) == slowo.toUpperCase().charAt(0))
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(stringSet1);
    }
}
