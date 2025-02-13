package com.celcom.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class ImagecopyExample {

	public static void main(String[] args) throws IOException{
		FileInputStream fr = new FileInputStream("D://tree.jpg");
		FileOutputStream fw = new FileOutputStream("D://tree1.jpg");
		int ch=0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		
		System.out.println("File Copied");
	}

}
