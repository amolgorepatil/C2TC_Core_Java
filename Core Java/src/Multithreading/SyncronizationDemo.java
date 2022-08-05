// Demo on synchronized
package Multithreading;
class Counter
{
	int count;
	public synchronized void inc()
	{
		count++;
	}
	
}

public class SyncronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c=new Counter();
		// First Thread
		Thread t1=new Thread(new Runnable()
				
				{
			@Override
			public void run() {
					for (int  i=1;i<=10000;i++)
					{
						c.inc();
						
					}
				 }
				
				});
		// Second Thread
		
		Thread t2=new Thread(new Runnable()
				{
			@Override
			public void run() {
				for (int i=1; i<=10000;i++)
				{
					c.inc();
					
				}
			}
			
				});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		
		System.out.println(c.count);
				
	}

}
