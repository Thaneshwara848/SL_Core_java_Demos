
class X
{
	int a=10;
	int b=20;
	X(){System.out.println(a+b);}
	void m1() { System.out.println(a+b);}
	void m2() { System.out.println(a*b);}
}
class Y  extends X
{
	
	int c=30;
	int d=40;

	Y(){}
	// we are qaurin gthis 4 lines of code from X class or parent class or super class or base class 
	//int a=10;
	//int b=20;
	//void m1() { System.out.println(a+b);}
	//void m2() { System.out.println(a*b);}


	void m3() { System.out.println(a/b);}
	void m4() {System.out.println(a*b);} 
}
 class Demo1 {

	public static void main(String[] args) {
		
		X x=new X();		
		x.m1();
		x.m2();
		
			System.out.println("Y class ");
		Y y =new Y();
		y.m1();
		y.m2();
		y.m3();
		y.m4();
	}

}
