package ExcepetionHandelling;

public class DemoMultipleCatch {

	public static void main(String[] args) {
		
		int j=0;
		
		try {
			int a[] = new int [10];
			a[10] =30 / j;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic Exception Occured");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundException Occured");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is optional but if used it will be executed whether expetion handelled or Not");
		}
		System.out.println("Rest Of The Code");
	}

}
