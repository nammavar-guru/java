package com.example.core.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamExample {

	public static void main(String[] args) throws Exception {
		//Input is file and output is file
		FileInputStream fin = new FileInputStream("File1.txt");
		FileOutputStream fout = new FileOutputStream("File2.txt");
		int b;
		while((b=fin.read())!= -1) { // read byte by byte till end of file returns -1
			fout.write(b); // Writing to file output
			System.out.print((char)b); // Writing into console output
		}
		
		fout.close();
		fin.close();
		
		//Input is String ; Output is File
		String str = "This is the content";
		byte []content = str.getBytes();
		FileOutputStream fouts = new FileOutputStream("StringFile.txt");
		fouts.write(content);
		fouts.close();
		
		//Stores the string into file using ByteArrayOutputStream
		String strb = "This is the content strB";
		byte [] bcontent = strb.getBytes();
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(bcontent);
		FileOutputStream foutb = new FileOutputStream("CharacterFile.txt");
		bout.writeTo(foutb);
		foutb.close();
		
		//Stores the string into file using ByteArrayInputStream
		String strc ="This is the content for strc";
		byte []contentc = strc.getBytes();
		ByteArrayInputStream bis = new ByteArrayInputStream(contentc);
		FileOutputStream foutc = new FileOutputStream("CharFile.txt");
		int bc;
		System.out.println("Byte through bis console output");
		while((bc=bis.read())!=-1) {
			foutc.write(bc); // Write the content to file
			System.out.print((char)bc); // print the content in the console
		}
		foutc.close();
		
		//read from file using byte and write into file.
		FileInputStream fis = new FileInputStream("File1.txt");
		byte []buffer = new byte[fis.available()];
		fis.read(buffer);
				
		FileOutputStream fos = new FileOutputStream("File3.txt");
		fos.write(buffer); //Writing byte data into file
		System.out.println("\n Byte to console output");
		for(byte by:buffer) {
			System.out.print((char)by);
		}
		fos.close();
		fis.close();
		
	}

}
