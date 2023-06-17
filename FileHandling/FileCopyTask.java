package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class FileCopyTask  {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1 = new FileInputStream("F://IntelliJ-Java-Practice//FileHandling//Source1.txt");
        FileInputStream fis2 = new FileInputStream("F://IntelliJ-Java-Practice//FileHandling//Source2.txt");

        FileOutputStream fos = new FileOutputStream("F://IntelliJ-Java-Practice//FileHandling//Destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int b;
        while((b = sis.read()) != -1) {
            fos.write(b);
        }

        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
    }
}
