package ClaasInterfaceExamples;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI b1 = new SBI() ;
		System.out.println("Rate of interest: " +b1.rateOfInt());
		
		RBI b2 = new PNB();
		
		System.out.println("Rate of Interest:  "+b2.rateOfInt()) ;
		
		RBI b3 = new PNB();
		
		System.out.println("Rate of Interest:  "+b3.rateOfInt()) ;
	}

}
