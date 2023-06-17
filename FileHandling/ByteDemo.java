package FileHandling;

import java.io.CharArrayReader;
import java.io.IOException;

public class ByteDemo {
    public static void main(String[] args) throws IOException {
        char[] c = {'a','b','c','d','e','f','g','h','i','j'};

        CharArrayReader cr = new CharArrayReader(c);

        int x;

        while((x = cr.read()) != -1) {
            System.out.println((char) x);
        }
        cr.close();
    }
}
