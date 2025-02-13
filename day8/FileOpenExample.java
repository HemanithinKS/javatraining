package com.celcom.day8;

import java.io.FileReader;
import java.io.IOException;

public class FileOpenExample {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("D://example.txt");
		int ch=0;
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		fr.close();
	}

}
