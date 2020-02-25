package com.example.core.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamExample {

	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("Data.out1"));
		dos.writeDouble(1.1);
		dos.writeBoolean(true);
		dos.writeInt(1000);
		dos.writeChar('G');
		//dos.writeChars("Welcome");
		dos.writeUTF("guru");
		dos.writeByte('g');
		dos.writeBytes("gurunathaan");
		
		
		DataInputStream dis = new DataInputStream(new FileInputStream("Data.out1"));
		System.out.println("dis.readDouble"+dis.readDouble());
		System.out.println("dis.readBoolean"+dis.readBoolean());
		System.out.println("dis.readInt"+dis.readInt());
		System.out.println("dis.readChar"+dis.readChar());
		//System.out.println("dis.readLine"+dis.readChar());
		System.out.println("dis.readUTF"+dis.readUTF());
		System.out.println("dis.readByte"+dis.readByte());
		System.out.println("dis.readByte"+dis.readLine());
		
	}

}
