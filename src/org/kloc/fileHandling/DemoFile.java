package org.kloc.fileHandling;

import java.io.File;
import java.io.IOException;

public class DemoFile 
{
	public static void main(String[] args) 
	{
		File f=new File("ritesh123");
		System.out.println(f.exists());
		try 
		{
			f.createNewFile();
		} catch (IOException e) 
		{		
			e.printStackTrace();
		}
		System.out.println(f.exists());
	}
}
