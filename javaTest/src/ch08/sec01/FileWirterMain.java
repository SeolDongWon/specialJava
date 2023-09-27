package ch08.sec01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWirterMain {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\javaTest10\\javaTestWrite.txt");
			while (true) {
				String inputData = scan.nextLine();
				if(inputData.length()==0) {
					break;
				}
				fw.write(inputData, 0, inputData.length());
				fw.write("\r\n",0,2);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		scan.close();
		fw.close();
		System.out.println("END");
	}
}
