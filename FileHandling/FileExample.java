package FileHandling;


import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String[] names = {"Arka", "Yash", "Debayan"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("F://IntelliJ-Java-Practice//FileHandling//Test1.txt"));
            writer.write("Learn and practicing for final semester java exam");
            writer.write("\nNew Sentence");

            for(String name : names) {
                writer.write("\n " + name);
            }
            writer.close();
            System.out.println("Operation successful");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("F://IntelliJ-Java-Practice//FileHandling//Test1.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
