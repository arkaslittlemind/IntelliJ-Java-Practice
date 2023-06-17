

import java.io.*;
import java.util.*;

class Q4A2 {
	public static void main(String args[]) throws Exception
	{
	int i;
	FileInputStream fin = null;
	FileOutputStream fout = null;
	Scanner sc = new Scanner(System.in);

		System.out.println("Enter source file name");
		String src = sc.nextLine();
		fin = new FileInputStream(src);

		System.out.println("Enter destination file name");
		String dest = sc.nextLine();
		
		if((new File(dest)).isFile()) { //dest is a file
			System.out.println("dest is a file");
			fout = new FileOutputStream(dest);
		
			do {
				i = fin.read();
				if(i != -1) fout.write((char)i);
			} while(i != -1);
		
		}// dest is a file 
		
		else {
			System.out.println("dest is a Directory");	
		  
			System.out.println("Enter file name");
		  	String fname = sc.nextLine();	
		  	fout = new FileOutputStream("d:\\winter2223\\"+fname);
		  	do {
				i = fin.read();
				if(i != -1) fout.write((char)i);
		   	} while(i != -1);

		new File("d:\\winter2223\\"+src).delete();
		}
	}
}