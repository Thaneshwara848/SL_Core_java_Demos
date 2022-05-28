import java.util.*;
class Demo1
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter A Value");
			// int a=sc.nextInt();
		
			System.out.println("Enter B Value");
			//int b=sc.nextInt();
			//int c=a/b ;
			//System.out.println(c);	

		
			String name= null ;
			System.out.println(name.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arry Boy  we cant divd anything / 0 ");
		}
		
		catch(InputMismatchException ime)
		{
			System.out.println("hy baba please enter only number ");
		}
		catch(NullPointerException npe)
		{
	
			System.out.println("name cant be null  ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			

		finally
		{
			System.out.println("Thank you ,....!");
		}
	}
}

		
		

// run time Exception 
//ArithmeticException
//InputMismatchException  
//NullpoinerrException 
// NumberFormatException
// ArrayIndecOut oF Boutd 

// compile TIme exception 
	// FIle not Found 
	// SQL Exception 
	// 


//throws 

	it is used to handle the checked exception 


// errro 				Exception  handling 

//can not be recoverable 		 recprveable 



//Exception Hanfdnig : 
	//1) compile time exception 
	//2) Run time Exception 
			//ArithmeticException 
			//InputMismatchException  
			// nullpointer  Exception 
			//AarrayIndecOutOf Bound Excepton 




				Exception (recoverable )					Error (non recverable )


checked Exception 			unchecked Exception 
compile time exception 		Run Time Exception 


1) FIleNot Found			AE
2)SQL Exception 			NullPoiner
				InputMismathc Exception
				arrayIndexOut F Bound 
				NumberFOrmat Exception 



Error : non recoverable 
Exception   : yes 

	CE
	UCE
	
	
	
	2 types 
		1) try cathc m, finally 
		2) Throws 

	try :  risy code or might be problm 
	cathc : solutions 
	finallly  : it will execute alwasys 
	thorws : it used to handl the checked exception 
	thorw  : raise exception manually 



