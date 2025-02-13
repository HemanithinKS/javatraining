package com.celcom.day8;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("D://example.txt");
		FileWriter fw = new FileWriter("D://example1.txt");
		int ch=0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		
		System.out.println("File Copied");
	}

}
