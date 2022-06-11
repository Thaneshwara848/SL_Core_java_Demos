class A 
{
	static int x=200;
	public static void abc()
	{
		System.out.println("Hi Simple Method  just to check ");
	}
}
class Demo1
{
	public static void main(String  args[])
	{
		//A a =new A();	// new ----> it will occupi some memory 	
		//a.abc();
		A.abc();
		System.out.println(A.x);	
	}
}

