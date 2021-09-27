/*
 * This program demonstrates how to lock an object using synchronization
 */
package day3.multithreading;

public class CountdownMain {

    public static void main(String[] args) {
       
    	Countdown cd = new Countdown();
    	CountdownThread one = new CountdownThread(cd);
    	CountdownThread two = new CountdownThread(cd);
        one.start();
        two.start();
    }
}   

