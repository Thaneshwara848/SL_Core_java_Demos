class A
{
	void abc()
	{
		//int arr[]={10,20,30,25,45,50,60}; // static vaues 
		int arr[]={10,20,30,25,45,50,60};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("Onother approach ");
		int a[]=new int[6];
		a[0]=0;
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		a[5]=50;

		for (int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}

		System.out.println("=== FOr Each ==== ");
		for(int x : a)
		{
			System.out.println(x);	
		}
		
	}
}
class ArrDemo
{
	public static void main(String args[])
	{
	
		A a =new A();
		a.abc();
	}
}

// size is fixed 
// similer kind of data // homoginus s