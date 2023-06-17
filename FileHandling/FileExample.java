package FileHandling;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("F:/IntelliJ-Java-Practice/FileHandling/Test1.txt"));
            writer.write("Learn and practicing for final semester java exam");
            writer.close();
            System.out.println("Operation successful");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
