package createThreadsUsingRunnableInterface;

import ThreadsRunnable.ThreadRunnable;

public class Threads {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** The multithreading allows the execution of two or more parts of a program for maximum utilizations of CPU.
		 *  The threads can be created using two mechanism. This one will be implementing Runnable Iterface.*/
		
		/* 
		 * See:
		 * https://www.geeksforgeeks.org/multithreading-in-java/
		 * https://www.tutorialspoint.com/java/java_multithreading.htm
		 * https://www.javatpoint.com/creating-thread
		 */
		
		ThreadRunnable thr1 = new ThreadRunnable("New thread");
		thr1.start();
		
		ThreadRunnable thr2 = new ThreadRunnable("Another thread");
		thr2.start();
	}

}
