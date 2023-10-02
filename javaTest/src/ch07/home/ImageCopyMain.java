package ch07.home;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyMain {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\download\\mire.jpg");
		FileOutputStream fos = new FileOutputStream("C:\\download\\mire2.jpg");
		
		int data = 0;
		while((data=fis.read())!=-1) {
			fos.write(data);
		}
		
		fis.close();
		fos.close();
	}
}
