package Day9.inputoutput.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FilesShowcase {

    public static void main(String[] args) throws IOException {

        Path one = null, two = null;

        Files.copy(one, two, StandardCopyOption.REPLACE_EXISTING);
        Files.isWritable(one);
        Files.isReadable(two);

        Files.delete(one);

        //Files.deleteIfExists(two);
        //Files.copy(one)
        //Files.move(two)
        //Files.readAllBytes()

    }
}
