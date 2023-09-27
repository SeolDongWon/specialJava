package ch08.sec01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyMain {
	public static void main(String[] args) throws IOException {
		File src = new File("C:/Windows/system.ini");
		File dest = new File("C:/javaTest10/mysystem.txt");
		
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dest);
		
		while(true) {
			int data = fr.read();
			if(data==-1) break;
			fw.write((char)data);
		}
		
		fr.close();
		fw.close();
		System.out.printf("%s에서 %s로 파일복사완료\n",src.getName(),dest.getName());
		System.out.println("END");
		
	}
}
