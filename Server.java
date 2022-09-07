import java.lang.*;
import java.net.*;
import java.io.*;
import java.util.*;

class Server
{
	public static void main(String arg[])throws Exception
	{
		System.out.println("Server application is running");
		
		String s1,s2;
		
		ServerSocket ss=new ServerSocket(200);
		Socket s=ss.accept();
		
		BufferedReader brk=new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
        PrintStream ps=new PrintStream(s.getOutputStream());
		
		while(true)
		{
			s1=br.readLine();
			System.out.println("client:"+s1);
			System.out.println("");
			s2=brk.readLine();
			ps.println(s2);
		}
		
	}
}