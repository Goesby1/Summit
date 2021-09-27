package day3.multithreading;
class MyYieldThread4321 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class YieldDemo123 {

	public static void main(String[] args) {
		MyYieldThread4321 myt4321=new MyYieldThread4321();
		Thread t=new Thread(myt4321);
		t.start();

		for(int i=1;i<=10;i++)
		System.out.println("main thread");
	}

}
