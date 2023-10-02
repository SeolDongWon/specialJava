package ch07.home;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyMain {
	public static void main(String[] args) throws IOException {
		File cC = new File("C:\\download\\A.txt");
		File cV = new File("C:\\download\\B.txt");
		
		FileReader fr = new FileReader(cC);
		FileWriter fw = new FileWriter(cV);
		
		int data;
		while((data=fr.read())!=-1) {
			System.out.print((char)data);
			fw.write((char)data);
		}
		
		fr.close();
		fw.close();
	}
}
