import java.util.Scanner;
class A
{
	A()
	{	
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name=sc.next();
		System.out.print("Enter English : ");
		int e=sc.nextInt();
		
		System.out.print("Enter Hindi : ");
		int h=sc.nextInt();
		System.out.print("Enter Kannada: ");
		int k=sc.nextInt();
		System.out.print("Enter Science : ");
		int s=sc.nextInt();
		System.out.print("Enter Social : ");
		int ss=sc.nextInt();
		System.out.print("Enter mathamatics : ");
		int m=sc.nextInt();
		int marks =e+h+k+s+ss+m;
		int res =marks /6 ;
		System.out.println("My Result is "+ res );
		
		if(res > 85 )
		{
			System.out.println(" Hi "+ name+ " your marks is "+marks  +" And you got  Distinction .....!");
		}
		else if(res < 85 && res > 60 )
		{
			System.out.println(" Hi "+ name+ " your marks is "+marks  +" And you got   First class .....!");
		}
		else if( res > 50 &&  res  < 60 )
		{
		
		System.out.println(" Hi "+ name+ "  your marks is "+marks  + " And you got  Second class" );
		
		}
		else if (res > 35 && res < 50 )
		{
		System.out.println(" Hi "+ name+ "your marks is "+marks  +" And you got  Just Pass " );
		}
		else 
		{
			System.out.println("FAIL ");
		}			
	}
}
class Demo6
{
	public static void main(String args[])
	{
		A a =new A();	
	}
}