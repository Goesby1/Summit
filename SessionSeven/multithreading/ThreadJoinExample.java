package day3.multithreading;
public class ThreadJoinExample {
    public static void main(String[] args) {
        TestJoinClass t1 = new TestJoinClass("t1");  
        TestJoinClass t2 = new TestJoinClass("t2");  
        TestJoinClass t3 = new TestJoinClass("t3");  
        t1.start();  

        try{  
          t1.join();  //  main thread executes line10, main is waiting until t1 die
        }catch(Exception e){System.out.println(e);}  
       
        t2.start(); 

        try{  
            t2.join();  //  main thread executes line15, main threading is waiting until t2 die
        }catch(Exception e){System.out.println(e);}  
        //thread 3 won't start until thread 2 is complete
        t3.start();  
        try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("hello, i am from main :(");
    }
    
}
