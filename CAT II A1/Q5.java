import java.io.*;

class Q5 {
	public static void main(String... args) throws Exception {
		try (RandomAccessFile raf = new RandomAccessFile("raf.odf", "rw")) {
			writeNumber(raf, 10, 22000000);
			writeNumber(raf, 20, 32000000);
			writeNumber(raf, 30, 52000000);
			writeNumber(raf, 40, 22000000);
			writeNumber(raf, 50, 62000000);


			System.out.println(readNumber(raf, 10));
			System.out.println(readNumber(raf, 20));
			System.out.println(readNumber(raf, 30));
			System.out.println(readNumber(raf, 40));
			System.out.println(readNumber(raf, 50));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void writeNumber(RandomAccessFile raf, long position, int number) throws IOException  {
		raf.seek(position);	raf.writeInt(number);		
	}
	static int readNumber(RandomAccessFile raf, long position) throws IOException {
			raf.seek(position); 
			return raf.readInt();	
	}
}