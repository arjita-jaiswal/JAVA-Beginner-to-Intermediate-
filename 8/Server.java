import java.util.*;

import java.io.*;

import java.net.*;

public class Server {
	
public static void main(String[] args) {

		
	try {
			
		ServerSocket ss=new ServerSocket(5555);


		System.out.println("Server Side");

		boolean flag=true;


		while(flag) {
			
			Socket s=ss.accept();

	
			BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				
			PrintWriter out=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

	
			String str=null;
			
			while((str=in.readLine()) != null){

				if(str.equals("Over"))
{
			
				flag=false;
			
				break;
		
				}
			
				String temp="";
		
				for(int i=str.length()-1; i>=0; i--)

					temp =temp+str.charAt(i);

				if(temp.equals(str))
{
						
					out.println(1);

	
				}

				else
					out.println(0);
			
				out.flush();
	
			}
	
		}
	
	}	
	catch(Exception e) {
			
		System.out.println(e.getMessage());
	
	}
	
}
}

