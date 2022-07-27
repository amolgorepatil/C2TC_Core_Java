package WrapperClasses;

public class Wrapper {

	public static void main(String[] args) {
		
		Boolean b = new Boolean("true");
		
		Boolean c = new Boolean("NO");
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(b.equals(c));
	}

}
