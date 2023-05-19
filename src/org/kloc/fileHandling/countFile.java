package org.kloc.fileHandling;

import java.io.File;

public class countFile 
{
	public static void main(String[] args) 
	{
		File f=new File("C:\\");
		int count=0;
		String[] s=f.list();
		for(String st:s)
		{
			count++;
			File f1=new File(f,st);
			if(f1.isDirectory())
			{
				System.out.println(st);
			}	
		}
		System.out.println("the total number file is:"+count);
	}
}
