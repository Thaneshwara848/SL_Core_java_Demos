import java.util.*;
import java.io.*;
class Demo1
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("ENter First  Name : ");
			String first=br.readLine();
			
			System.out.println("ENter Last Name : ");
			String last=br.readLine();	

			System.out.println("My Full name is : "+ first + ":  "+last);
		}
		catch(Exception e)
		{
	
		}
	}
}