import java.util.*;
import java.io.*;
class Demo3
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
				
			}
			else
			{
				System.out.println("Sorry FIle Dont Exists i just created it  ");
				File ff=new File("abc");
				ff.mkdir();
				
				//f.createNewFile();
			
			}
			
		}
		catch(Exception e)
		{
	
		}
	}
}