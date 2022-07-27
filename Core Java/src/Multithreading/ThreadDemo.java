package Multithreading;

class MyThread implements Runnable
{
	public void run() {
		for (int i=0; i<5;i++)
		{
			System.out.println(i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t= new MyThread();
		
		Thread s = new Thread(t);
		s.start();
	}

}
