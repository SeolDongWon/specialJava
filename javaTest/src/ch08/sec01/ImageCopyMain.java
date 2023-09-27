package ch08.sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyMain {
	public static void main(String[] args) throws IOException {
//		FileInputStream fio = new FileInputStream("C:\\javaTest10\\imege.jpg");
//		FileOutputStream fos = new FileOutputStream("C:\\javaTest10\\seol.jpg");
		FileInputStream fio = new FileInputStream("C:\\javaTest10\\javaTest.txt");
		FileOutputStream fos = new FileOutputStream("C:\\javaTest10\\seol.txt");
		
		int data=0;
		while((data = fio.read())!=-1) {
			fos.write(data);
		}
		
		System.out.println("복사완료");
		fio.close();
		fos.close();
		System.out.println("END");
	}
}
