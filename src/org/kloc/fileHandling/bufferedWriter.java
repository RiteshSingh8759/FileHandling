package org.kloc.fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("abc.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.write("urga software solutions");
		bw.newLine();
		bw.write(new char[] {'a','b','c','d','e'});
		bw.newLine();
		bw.write("ritesh singh");
		bw.newLine();
		bw.flush();
		bw.close();
		fw.close(); 
		//Reading by using read method
		//======================================
//		FileReader fr=new FileReader("abc.txt");
//		int i=fr.read();
//		while(i!=-1)
//		{
//			System.out.print((char)i);
//			i=fr.read();
//		}
//		fr.close();
		//=======================================
		//Reading by using read with parameter char array
//		FileReader fr1=new FileReader("abc.txt");
//		int i2=fr1.read(new char[100]);
//		System.out.println((char)i2);
		// Reading by using char array with parameter we are passing the data length
//		File f=new File("abc.txt");
//		FileReader fr2=new FileReader("abc.txt");
//		char[] ch=new char[(int)f.length()];
//		fr2.read(ch);
//		for(char ch1:ch)
//		{
//			System.out.print(ch1);
//		}
	}

}
