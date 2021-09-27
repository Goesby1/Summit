package day3.multithreading;

public class CountdownThread extends Thread {
	Countdown cd;
	public CountdownThread(Countdown cd) {
		// TODO Auto-generated constructor stub
		this.cd=cd;
	}
@Override
public void run() {
	// TODO Auto-generated method stub
	cd.printCount();
}
}
