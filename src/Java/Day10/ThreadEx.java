package Java.Day10;

/*
 * Thread :
 * 
 * What is thread ?
 * Single vs Mutli thread
 * Exclusive lock
 * Dead lock
 * String vs StringBuffer vs StringBuilder
 */

class Task implements Runnable {
	
	Thread myThread;
	
	private String name;
	
	// constructor
	Task(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// do the task
		System.out.println("inside run()");
		System.out.println("Thread running " + name);
		
		for (int i=0; i<4; i++) {
			System.out.println(i);
			System.out.println(name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread has been interrrupted");
			}
		}
	}
	
	public void start() {
		System.out.println("inside start(), Thread started");
		
		if (myThread == null) {
			myThread = new Thread(this, name);
			myThread.start();
		}
	}
}


public class ThreadEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Demo");
		
		Task task1 = new Task("Thread 1");
		Task task2 = new Task("Thread 2");
		
		task1.start();
		task2.start();
			
	}
}
