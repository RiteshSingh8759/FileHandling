package org.kloc.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class searchingWord {

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given word that we have to find");
		String st=sc.next();
		File f=new File("abc.txt");
		FileReader fr=new FileReader(f);
		BufferedReader bf=new BufferedReader(fr);
		String s=bf.readLine();
		while(s!=null)
		{
			if(s.contains(st))
			{
				 System.out.println(s);
			}
		}
		bf.close();
		
	}

}
