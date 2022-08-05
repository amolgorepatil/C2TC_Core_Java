package ExcepetionHandelling;
import java.io.IOException;

public class ThrowsExample {

	
		void myMethod() throws IOException{
			throw new IOException("Device is not Compatible");
			
		}
		void myMethod1() throws IOException {
			myMethod();
			
		}
		
		void myMethod2() {
		
		try {
			myMethod1();
			
		}
			catch (Exception e) {
				System.out.println("Exception Messege " +e);
			}
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample t = new ThrowsExample();
		t.myMethod2();
		System.out.println("Rest Of the Code");
	}

}
