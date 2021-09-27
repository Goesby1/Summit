package day3.multithreading;

public class ThreadDemoYield implements Runnable {
	   Thread t8;
	   ThreadDemoYield(String str) {
	   t8 = new Thread(this, str);
	   // this will call run() function
	   t8.start();
	   }
	   public void run() {
	   for (int i = 0; i < 5; i++) {
	   // yields control to another thread every 5 iterations
	   if ((i %  5) ==0) {
	   System.out.println(Thread.currentThread().getName() + "  yielding control...");
	               
	   /* causes the currently executing thread object to temporarily 
	   pause and allow other threads to execute */
	   Thread.yield();
	   }
	   }
	   System.out.println(Thread.currentThread().getName() + " has finished executing.");
	   }
	   public static void main(String[] args) {
	   new ThreadDemoYield("Thread A");
	   new ThreadDemoYield("Thread B");
	   new ThreadDemoYield("Thread C");
	   }
	} 