import java.io.*;
import java.lang.*;
import java.util.*;
public class poem extends Thread
{
	Scanner scan=null;
	public int c=0;
	public void run()
	{
			try
			{
				File fr=new File("poem.txt");
					 scan=new Scanner(fr);
				while(scan.hasNext())
				{
						scan.next();
						c++;
				}
					System.out.println("no of words:"+c);
			}
			catch( Exception e)
			{
						System.out.println(e.getMessage());
			}
	}
}