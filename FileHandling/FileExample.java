package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("F:/IntelliJ-Java-Practice/FileHandling/Test.txt");

            String str = "Learn JAVA for FAT";
            fos.write(str.getBytes());
            fos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
