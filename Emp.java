import java.util.Scanner;
 class Emp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("ENter Id :");
		int  id=sc.nextInt();


		System.out.print("Enter Name :");
		String name=sc.next();

		System.out.print("ENter Age : ");
		int age=sc.nextInt();

		System.out.print("ENter SALARY : ");
		int salary=sc.nextInt();

		System.out.print("ENter Designation : ");
		String  desig =sc.next();

		System.out.println("=======================");
		System.out.println("ID is : "+id);
		System.out.println("NAme is : "+name);
		System.out.println("AGE is : "+age );
		System.out.println("SALARY  is : "+salary );
		System.out.println("Designation  is : "+desig );
	}
}