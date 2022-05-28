class X  extends Thread 
{
	public  void run ()
	{
		for(int  i=0;i<=30;i++)
		{
			System.out.println(Thread.currentThread().getName()+": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			System.out.println(e);
			}
		}
		
	}
}

public class MtDemo {

	public static void main(String[] args) {
		X  x=new X ();
		Thread t1=new Thread(x);
		Thread t2=new Thread(x);

		t2.start();
		t1.start();
		
	
		t1.setName("Seetha");
		t2.setName("Rama");

		for(int  k=0;k<=30;k++)
		{
			System.out.println("			K  "+k);
			try {
				if(k==10)
					t1.suspend();

				if(k==15 )
					t1.resume();
				if(k==20)
					System.out.println( t1.isAlive());
				if(k==21)
					t1.stop();
				if(k==25)
					System.out.println( t1.isAlive());
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
		}
		
	}

}
run 
start
detname 
GetName
SetProtity 
Get DPreiotoy 
Thread.currentThreaf();
suspend 
resum 
		basics 
		OOps :
			callad Onject 

			inheritane 
			polyMorpis 
			Abstraction 
			Enculpulation 


		Exception Hanfdlgin 

		Multihrading 

