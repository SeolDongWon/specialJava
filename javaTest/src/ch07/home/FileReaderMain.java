package ch07.home;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Windows\\system.ini");
		
		int data;
		while((data= fr.read())!=-1) {
			System.out.print((char)data);
		}
	}
}
