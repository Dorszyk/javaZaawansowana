package Day9.inputoutput.nio.Ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class PanTadeusz {

    public static void main(String[] args) throws IOException {

        Path panTadeusz = Paths.get("C:\\Users\\piotr.doroszynski\\Desktop\\Java_SDA_49\\javaZaawansowana\\src\\main\\resources\\Pan_Tadeusz.txt");
        String wordToFind = "Tadeusz";
        System.out.println(countWordOccurancesInBook(wordToFind, panTadeusz));
    }
    public static long countWordOccurancesInBook(String word, Path book) throws IOException {

        return Files.readAllLines(book).stream()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .filter(wordtake -> wordtake.equalsIgnoreCase(word))
                .count();
    }
}



