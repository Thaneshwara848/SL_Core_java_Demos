import java.util.*;
import java.io.*;
class Demo2
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter FIle Name : ");
			String myfile=br.readLine();
			File f=new File(myfile);
			 if(f.exists())
			{
				PrintWriter pw=new PrintWriter(new  FileOutputStream(f,true));
				System.out.println("Enter The Name : ");
				String name =br.readLine();
				System.out.println("Enter The Age : ");
				String age=br.readLine();
				System.out.println("Enter The Saalry : ");
				String salary =br.readLine();
				pw.println(name + " : "+ age +" : "+salary  );
				pw.close();	
			}
			else
			{
				System.out.println("Sorry FIle Dont Exists ");
			}
			
		}
		catch(Exception e)
		{
	
		}
	}
}




			COllection : 
				Create
				DIsplay 
				Raise Sal 
				Exit 



			IO  
				Create 
				Read 
			
















