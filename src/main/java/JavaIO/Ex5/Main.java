package JavaIO.Ex5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        UserParser userParser = new UserParser();

        Path path = Paths.get("C:\\Users\\piotr.doroszynski\\Desktop\\Java_SDA_49\\javaZaawansowana\\src\\main\\resources\\user.txt");

        List<User> users = new ArrayList<>();

        List<String> lines = Files.readAllLines(path);
        for (String line : lines){
            User user = userParser.fromCSV(line);
            users.add(user);
        }
        System.out.println("Results" + users);

    }
}
