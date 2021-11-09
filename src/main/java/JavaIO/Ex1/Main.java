package JavaIO.Ex1;

import java.io.File;

public class Main {
    public static void main(String[] args)  {


        File file = new File("C:\\Users\\piotr.doroszynski\\Desktop\\Java_SDA_49\\javaZaawansowana\\src\\main\\resources\\");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);

        }
    }
}
