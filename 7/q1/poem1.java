import java.io.*;
import java.io.File;
import java.lang.*;
import java.util.*;
public class poem1 extends Thread
{
	Scanner scan=null;
	int c=0;
	public void run(){
	try{

			Thread.currentThread().sleep(1000);
		File f1 = new File("poem.txt");
		scan = new Scanner(f1);
		String vowel="aAeEiIoOuU";
		while(scan.hasNext())
		{
				String s1=scan.next();
				for(int i=0;i<s1.length();i++)
				{
					for(int j=0;j<vowel.length();j++)
					{
						if(s1.charAt(i)==(vowel.charAt(j)))
						{
							c++;
							break;
						}
					}
				}

		}
		System.out.println("no of vowels:"+c);
	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	}
