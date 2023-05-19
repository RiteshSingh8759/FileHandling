package org.kloc.fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printWriter {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("ab.txt",true);
		PrintWriter pw=new PrintWriter(fw);
		pw.write(100);		
		pw.write("Ritesh Singh/n");
		pw.println(100);
		pw.println(245.0373);
		pw.println("Avinas");
		pw.append('h');
		pw.flush();
		pw.close();
		
	}

}
