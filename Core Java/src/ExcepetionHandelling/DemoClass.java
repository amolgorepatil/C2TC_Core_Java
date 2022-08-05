package ExcepetionHandelling;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		int data = 10 / 0;
		}
		
		catch (Exception e) {
			System.out.println("generatted Exception "+e);
		}
		System.out.println("Welcome to the World");
	}

}
