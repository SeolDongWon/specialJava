package ch07.home;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWiterMain {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\download\\seol.txt");
		
		System.out.println("INPUT");
		while(true) {
			String input = scan.nextLine();
			if(input.length()==0)break;
			fw.write(input);
			fw.write("\r\n");
		}
		
		scan.close();
		fw.close();
	}
}
