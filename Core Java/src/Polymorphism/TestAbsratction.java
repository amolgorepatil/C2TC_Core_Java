package Polymorphism;

public class TestAbsratction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		
		b = new Sbi();
		System.out.println("rate of Interest in Sbi..." +b.getInterest());
		
		b= new PNB();
		System.out.println("Rate of interest in PNB  " +b.getInterest());
		
		b= new HDFC();
		System.out.println("Rate of interest in HDFC  " +b.getInterest());
	}

}
