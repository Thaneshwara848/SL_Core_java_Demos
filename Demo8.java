import java.util.Scanner;
class A
{
	A()
	{	
		for(int i=0 ; i<= 10 ; i++)
		{
			if(i==5)
			{
				continue;
				//break;
			}
			System.out.println("I : "+ i);
		}	
		
		System.out.println("=====While Demo =====");

		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	
		System.out.println("===== Do While Demo =====");
		int j=1;
		do
		{
			System.out.println(j);
			j++;
		}while(j<=10);
		
	
	}
}
class Demo8
{
	public static void main(String args[])
	{
		A a =new A();	
	}
}
