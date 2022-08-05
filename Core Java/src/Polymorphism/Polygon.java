package Polymorphism;

public class Polygon {
	void area() {
		System.out.println("Calculating area....");
	}
	
	void area (int r) {
		System.out.println("Area of circle:  " +(3.14*r*r));
	}
	
	double area(double base, double height) {
		return(0.5*base*height);
		
	}
}
