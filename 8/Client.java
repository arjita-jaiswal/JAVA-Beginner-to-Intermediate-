import java.util.*;

import java.io.*;

import java.net.*;

public class Client {
	
public static void main(String[] args) {


	try {
			
		File f=new File("Word.txt");
		
		Scanner sc=new Scanner(f);

		Socket s=new Socket("localhost", 5555);

		BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			
		PrintWriter out=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

		
		while(sc.hasNextLine())
{

			String temp=sc.next();
	
			out.println(temp);
		
			out.flush();
	
		}

	
		out.println("Over");
			
		out.flush();


		File fw=new File("Answer.txt");
		
		fw.createNewFile();
			
		FileWriter wr=new FileWriter(fw);
			
		String str=null;
			
		while((str=in.readLine()) != null)
{

			wr.write(str+" "+"\n");

			wr.flush();
			
		}

		sc.close();
			
		in.close();
			
		out.close();
		
	}
 	catch(Exception e){
	
		System.out.println(e.getMessage());
	
	}
	
}

}

