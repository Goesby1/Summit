package day3.multithreading;
class Bank
{
	
}
class Thread4 extends Thread//,Bank
{
	public void run() {
		System.out.println("i am from thread from thread class");
	}
}
class RunnableThread1 extends Bank implements Runnable 
{
	public void run() {
		System.out.println("i am from thread1 from interface");
	}
}
public class RunnableInterface {
	public static void main(String[] args) {
		RunnableThread1 r = new RunnableThread1();
		Thread t = new Thread(r);
		//RunnableThread1 r = new RunnableThread1(t);
		t.start();
	}
}
