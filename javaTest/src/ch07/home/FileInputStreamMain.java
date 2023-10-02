package ch07.home;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamMain {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\download\\seol.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		
		int data;
		while((data=isr.read())!=-1) {
			System.out.print((char)data);
		}
		
	}

}
