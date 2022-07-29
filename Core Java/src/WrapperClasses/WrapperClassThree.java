package WrapperClasses;
//UnBoxing
public class WrapperClassThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d =  Double.valueOf(15.56);
		
		Character c = Character.valueOf('A');
		double d1 = d.doubleValue();
		
		
		char c1 = c.charValue();
		System.out.println("The Double Object to double primitive Value is: "+d1);
		System.out.println("The Double Object to double primitive Value is: "+c1);
		
	}

}
