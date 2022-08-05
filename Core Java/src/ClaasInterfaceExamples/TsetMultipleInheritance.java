package ClaasInterfaceExamples;

public class TsetMultipleInheritance implements FirstInterface, SecondInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TsetMultipleInheritance t = new TsetMultipleInheritance();
		t.show();
		t.print();
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to World");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Exmample of Multiple Inheritance");
	}

}
