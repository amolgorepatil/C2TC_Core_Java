package Polymorphism;

public class TestPolygon {

	public static void main(String[] args) {
		Polygon p = new Polygon();
		
		p.area();
		p.area(5);
		System.out.println(p.area(3, 6));
	}

}
