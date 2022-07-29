package WrapperClasses;
//AutoBoxing
public class WrapperClasstwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		double b= 63.221;
		// Converting primitive to Wrapper Objects
		Integer aOb = Integer.valueOf(a);
		Double bOb = Double.valueOf(b);
		
		if (aOb instanceof Integer) {
			System.out.println("Integer Object has been created");
			
			
		}
		 if (bOb instanceof Double) {
			 System.out.println("Double Object has been created");
		 }
	}

}
