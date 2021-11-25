package JavaIO.Ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{

        String longestWord = new Main().findLongestWords();

        System.out.println(longestWord);


    }

    public String findLongestWords() throws FileNotFoundException{

        String longestWord = "";
        String current;
        Scanner scanner = new Scanner(new File ("C:/Users/piotr.doroszynski/Desktop/Java_SDA_49/javaZaawansowana/src/main/resources/Pan_Tadeusz.txt"));
        while (scanner.hasNext()){
            current = scanner.next();
            if(current.length() > longestWord.length()){
                longestWord = current;
            }
        }
        return longestWord;
    }
}
