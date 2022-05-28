import java.io.*;

class A 
{
	void abc()
	{
		for(int i=1;i<=20;i++)
		{
			if (i==10 ) throw new ArithmeticException(); 
			System.out.println(i);
		}	
	}
}
class Demo2
{
	public static void main(String args[]) 
	{

		try
		{
			A a=new A();
			a.abc();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException came ");	
		}
	}
}
