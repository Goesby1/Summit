package day3.multithreading;

class FirstThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println(" Chaild1 thread ");
	}

}

/*
 * class SecondThread extends Thread {
 * 
 * @Override public void run() { for(int i=1;i<=10;i++)
 * System.out.println(" Chaild2 thread "); Test123 t1=new Test123(); t1.paly();
 * } }
 */
public class ThreadFirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Thread.currentThread().getPriority());
		FirstThread f9 = new FirstThread();
//		SecondThread f2 = new SecondThread();

		/*
		 * f9.setPriority(1); f2.setPriority(10);
		 */
		// f9.run();
		f9.start();
		//f9.start();
		// System.out.println(f9.getPriority());
		//f2.start();
		// System.out.println(f2.getPriority());
		for (int i = 1; i <= 10; i++)
			System.out.println(" Main thread");

	//	ChaildThread c = new ChaildThread();
		//Thread t = new Thread(c);
		//t.start();
		System.out.println("main thread");

	}
}
