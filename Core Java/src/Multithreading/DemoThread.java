// Create Thread Using Thread Class
package Multithreading;

class ChildThread extends Thread // Thread

{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("I am ChildThread");
			Thread.yield();
		}
	}
	
}

// Thread Scheduler
public class DemoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChildThread t=new ChildThread();
		   t.start();
		   int n = 10;
		   
		for (int i=0;i<10;i++)
		{
			System.out.println("I am MainThread");
		}
	}

}
