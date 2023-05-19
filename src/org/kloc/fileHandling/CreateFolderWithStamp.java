package org.kloc.fileHandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateFolderWithStamp 
{
	static String filename;
    public static void main(String[] args) throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the case number that u have to performed ");
        int n=sc.nextInt();
        switch(n)
        {
        case 1:
            createFolder();
        break;
        case 2:
            createFile();
        }
         
    }
    static void createFolder()
    {
        String timeDate=new SimpleDateFormat("ddMMyyyy").format(new Date());
        filename="KlocDetails "+timeDate;
        File f=new File(filename);
        f.mkdir();
    }
    static void createFile() throws IOException
    {
        for(int i=101;i<=151;i++)
        {
            Scanner sc1=new Scanner(System.in);
            System.out.println("press 1 to create a file");
            System.out.println("press 2 to delete file");
            System.out.println("enter the operation that u have to performed ");
            int a=sc1.nextInt();
            switch(a)
            {
            case 1:
            {
                File f1=new File("C:\\Users\\sh\\eclipse-workspace\\FileHandling\\"+"KlocDetails "+new SimpleDateFormat("ddMMyyyy").format(new Date()),"kloc_"+i+"_"+new SimpleDateFormat("ddMMyyyy").format(new Date())+".txt");
                f1.createNewFile();
                PrintWriter pw=new PrintWriter(f1);
                pw.print("Sushant Singh Rajput was born in Patna in the state of Bihar to Krishna Kumar Singh and Usha Singh.[2][9][10] His father is a retired technical officer and worked at"
                        + " Bihar State Handloom Corporation in Patna."
                        + "[11] He was the youngest of five siblings and had the nickname Gulshan"
                        + ".[12] One of his four sisters Mitu Singh was a state-level cricket player.[9]"
                        + " He attended the St. Karen's High School in Patna.[12][13] His family moved to Delhi "
                        + "following his mother's death in 2002 where Rajput completed his schooling for intermediate studies in Kulachi Hansraj Model School.[10]\r\n"
                        + "\r\n"
                        + "Rajput was reportedly an avid reader who was deeply interested in astrophysics and won the National"
                        + " Olympiad in Physics.[14] He secured admission in the Delhi College of Engineering (later renamed Delhi"
                        + " Technological University) to pursue a Bachelor of Engineering degree in mechanical engineering.[15][14] "
                        + "According to Rajput, he did not have any interest in engineering but his family gave him no option which "
                        + "left him dissatisfied. He instead wanted to become an astronaut and later an air force pilot but was also"
                        + " interested in Bollywood, being a fan of Shah Rukh Khan.");
            }
            break;
            case 2:
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the file number that u want to delete = ");
                int b=sc.nextInt();
                File f2=new File("C:\\Users\\MicroApt\\eclipse-workspace\\coreJavaPractise\\KlocDetails 26042023\\kloc_"+b+"_"+new SimpleDateFormat("ddMMyyyy").format(new Date())+".txt");
                f2.delete();
            }
            }
        }
    }
}
