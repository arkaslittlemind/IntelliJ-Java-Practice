import java.io.*;

class Q3 {
	
        public static void main(String... args) throws Exception {

         String str = "GPT-4 is the latest milestone in OpenAI’s effort in scaling up deep learning.";


		FileOutputStream fo = new FileOutputStream("first.txt");

		byte[] bytes = str.getBytes();

		fo.write(bytes);

		fo.close();

		FileWriter fw = new FileWriter("writer.txt");

		char [ ] chrs = str.toCharArray();

		fw.write(chrs);
		
		fw.close();
		

		FileInputStream fi = new FileInputStream("first.txt");

		int m = fi.read(); //read returns -1 when there is no data in the file

		while (m != -1) {
			System.out.print((char)m);
			m = fi.read();
		}
		fi.close();

		System.out.println();

		FileReader fr = new FileReader("writer.txt");
		m = fr.read();
		while (m != -1) {
			System.out.print((char)m);
			m = fr.read();
		}
		fr.close();		
	}
} 