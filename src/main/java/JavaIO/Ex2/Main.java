package JavaIO.Ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BufferedReader bufferedReader;
        String strLine;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\piotr.doroszynski\\Desktop\\Java_SDA_49\\javaZaawansowana\\src\\main\\resources\\user_test.html"));
            while ((strLine = bufferedReader.readLine()) != null) {
                System.out.println(strLine);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to read the file");
        }
    }
}
