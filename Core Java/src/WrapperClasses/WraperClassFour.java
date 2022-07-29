package WrapperClasses;

public class WraperClassFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=  10;
		short s= 15;
		int a= 25;
		long m= 30;
		float f= 3.14f;
		double d= 22.4;
		char c= 'A';
		boolean n= false;
		
		
		//AutoBoxing
		
		Byte bObj = b;
		Short sObj= s;
		Integer aObj=a;
		Long mObj= m;
		Float fObj =f;
		Double dObj = d;
		Character cObj =c;
		Boolean nObj = n;
		
		//Printing the objects
		System.out.println("Print the Object Values");
		System.out.println("Byte Object  "+bObj);
		System.out.println("Short Object  "+aObj);
		System.out.println("Integer Object  "+aObj);
		System.out.println("Long Object  "+mObj);
		System.out.println("Float Object  "+fObj);
		System.out.println("Double Object  "+dObj);
		System.out.println("Character Object  "+cObj);
		System.out.println("Boolean Object  "+nObj);
		
				
		//UnBoxing
		byte bvalue = bObj;
		short svalue =sObj;
		int avalue =aObj;
		long mvalue = mObj;
		float fvalue = fObj;
		double dvalue = dObj;
		char cvalue = cObj;
		boolean nvalue = nObj;
		
		
		System.out.println("Printing Primitive Values");
		System.out.println("Byte value : "+bvalue);
		System.out.println("Short value : "+svalue);
		System.out.println("Integer value : "+avalue);
		System.out.println("Long value : "+mvalue);
		System.out.println("Float value : "+fvalue);
		System.out.println("Double value : "+dvalue);
		System.out.println("Character value : "+cvalue);
		System.out.println("Boolean value : "+nvalue);
		
	}

}
