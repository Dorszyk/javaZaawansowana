package Day9.inputoutput.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;


        try {
            in = new FileInputStream("src\\main\\resources\\user.txt");
            out = new FileOutputStream("src\\main\\resources\\user_output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }

}
