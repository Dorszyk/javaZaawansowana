package Day5.Ex5.Ext;

import Day5.Ex5.WordCounter;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordsToCount = scanner.nextLine();
        Map<String, Integer> wordOccurrences = WordCounter.countWordOccurrences(wordsToCount);
        wordOccurrences = WordCounter.sortMapByValueDescending(wordOccurrences);
        System.out.println(wordOccurrences);

    }
}
