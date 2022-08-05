package Polymorphism;

public class Bajaj extends Bike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bajaj();
		b.run();
		b.show();
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Bike Riding..");
	}

}
