package com.example.core.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamExample {

	public static void main(String[] args) throws Exception {
		//Read from file and Write to file
		FileReader fr = new FileReader("File1.txt");
		FileWriter fw = new FileWriter("File2.txt");
		int c;
		while((c=fr.read())!=-1) {
			fw.write(c);
			System.out.print((char)c);
		}
		fw.close();
		fr.close();
		
		//Read from String and write to file
		String str ="This is the content from writer";
		FileWriter fwa = new FileWriter("File3.txt");
		fwa.write(str);
		fwa.close();
		
		// read from file using Buffered Reader and write to file
		BufferedReader br = new BufferedReader(new FileReader("File3.txt"));
		FileWriter fwb = new FileWriter("File4.txt");
		
		int cbr;
		while((cbr=br.read())!=-1) {
			fwb.write(cbr);
			System.out.print((char)cbr);
		}
		br.close();
		fwb.close();

		//read from file using Buffered Reader and 
		//write to file using buffered Reader - readLine
		BufferedReader bra = new BufferedReader(new FileReader("File1.txt"));
		FileWriter fwc = new FileWriter("File5.txt");
		
		String contentLine = bra.readLine();
		while(contentLine!=null) {
			fwc.write(contentLine);
			contentLine=bra.readLine();
		}
		bra.close();
		fwc.close();
	}

}
