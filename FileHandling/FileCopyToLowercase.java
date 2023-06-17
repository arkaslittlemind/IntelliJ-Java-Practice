package FileHandling;

import java.io.*;
import java.util.Locale;


public class FileCopyToLowercase {
    public static void main(String[] args) {
        String sourceFilePath = "Source.txt";
        String destinationFilePath = "Destination.txt";

        try {
            FileReader fileReader = new FileReader("Source.txt");
            FileWriter fileWriter = new FileWriter("Destination.txt");

            BufferedReader reader = new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            String line;

            while((line = reader.readLine()) != null) {
                String lowercaseline = line.toLowerCase(Locale.ROOT);
                writer.write(lowercaseline);
                writer.newLine();
            }
            reader.close();
            writer.close();

            System.out.println("Content copied from source to destination");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
