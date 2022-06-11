//final class A
class A
{
	final  String name="Rajesh";				// we cant re assign 
	// final void abc()
	 void abc()
	{	
		System.out.println("Methdo just ti check  ");		// we cant override 
	}
}
class B extends A 
{
	void abc()
	{	
		//System.out.println("Methdo just ti check  from B "+super.name);
	}
}
class Demo3
{
	public static void main(String args[])
	{
		A a=new A();
		//a.name="Rakesh"; we cant re assign 

		//System.out.println(a.name);	
		//a.abc();

		B b =new B();
		b.abc();
	}
}
// if it varaible : we cant re assign 
// if it a method : we cant ovver ride 
// if it a class : we can t in heriate 





















