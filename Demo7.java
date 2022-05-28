import java.util.Scanner;
class A
{
	A()
	{	
		
		System.out.println("1)  English ");
		System.out.println("2)  Hindi ");
		System.out.println("3)  Kannada");
		System.out.println("4)  Telgu");
		System.out.println("5)  Marati ");
		System.out.println("6 )  Tamil ");
		System.out.println("7 )  Panjabi");

		Scanner sc=new Scanner(System.in);

		System.out.print("ENter the Option : ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("English ");
				break;
			case 2:
				System.out.println("Hindi ");
				break;
			case 3:
				System.out.println(" Kannda ");
				break;
			default :
				System.out.println("not choosen any option ");
				break;	
		}	
	}
}
class Demo7
{
	public static void main(String args[])
	{
		A a =new A();	
	}
}