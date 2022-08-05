package ExcepetionHandelling;

public class ThrowExample {

		static void eligibility(int age) {
		if (age>=18) {
			System.out.println("Eligible for Vote");
		}
		else {
			throw new ArithmeticException("Not Eligible");
			
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eligibility(15);
		
	}

}
