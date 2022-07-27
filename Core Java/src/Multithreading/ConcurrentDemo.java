package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentDemo {

	public static void main (String[] args) {

	ReentrantLock l=new ReentrantLock();
	l.lock();
	
	//l.unlock();
	
	
	System.out.println(l.isHeldByCurrentThread());
	
	System.out.println(l.getHoldCount());
	
	System.out.println(l.getQueueLength());
	
	
	
	
	}

}
