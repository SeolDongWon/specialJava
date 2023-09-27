package ch08.sec01;

import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.util.Scanner;

public class FileReaderMain {
	public static void main(String[] args) {
		try {
			//Scanner scan = new Scanner(System.in);

			FileReader fr = new FileReader("C:\\Windows\\system.ini");
			while (true) {
				int data = fr.read();
				if (data == -1) {
					break;
				}
				System.out.print((char)data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("END");
	}
}
