import java.lang.*;
import java.util.*;
import java.io.*;
import java.net.*;

class Client
{
	public static void main(String arg[]) throws Exception
	{
	   String str1,str2;
	   Socket s=new Socket("localhost",200);
	  
	   BufferedReader brk=new BufferedReader(new InputStreamReader(System.in));
	   //accept data
		
	   BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
       //get data to server
	   
	   PrintStream ps=new PrintStream(s.getOutputStream());
	   //pass data to server
	  
	   while(true)	
	   {
	      str1=brk.readLine();
	      ps.println(str1);
	      str2=br.readLine();
	      System.out.println("server :"+str2); 	   
	   }
	}
}