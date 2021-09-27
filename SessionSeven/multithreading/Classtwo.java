package day3.multithreading;
public class Classtwo implements Runnable
{
	//Employee e;
	static Classtwo ra;
	Thread t1; // reference variable
	public Classtwo() 
	{
		t1=new Thread(ra);
		t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("paly");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ra=new Classtwo();
		/*Classone ra1=new Classone();
		Classone ra2=new Classone();*/
		//RunnableInterfacApp ra1=new RunnableInterfacApp();
		//ra1.start();
	}
}
