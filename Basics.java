class A
{
	A()
	{
		
		long a =2147483648L;
		System.out.println(a);
	
		float f=10/3f;
		System.out.println(f);
			// 3.3333333
		double d=10/3f;
			// 3. 33333333 (16 prcding )
			// if you want even decimal values // like scientf areas :
		System.out.println(d);
	}

}
class Basics 
{
	public static void main(String args[])
	{
		A a =new A();
	}
}

// byte size 1 byte = 8 bit  // 16 
// 2 * 2* 2* 2*2 * 2* 2* 2
//-128 to  + 127

// int 4 byte 
// 32 
	


	