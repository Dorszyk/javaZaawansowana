package Day9.inputoutput.serializacja;

import TypyGeneryczne.Ex4.Library;

import java.io.*;

public class SerializacjaShowcase {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("someObject.data");
        ObjectOutputStream out = new ObjectOutputStream(fos);

        out.writeObject(new Integer(1));

        FileInputStream fis = new FileInputStream("someObject.data");
        ObjectInputStream in = new ObjectInputStream(fis);

       Integer deserializacja = (Integer) in.readObject();

        System.out.println(deserializacja);


    }
}
