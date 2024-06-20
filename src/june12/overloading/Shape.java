package june12.overloading;

public class Shape {
	final static double Pi=3.14;
//	Calculate Area
//
//	Create a Shape class with a method calculateArea() that takes different parameters to calculate the area of different shapes.
//
//	Calculate the area of a rectangle with length and width as parameters.
//	Calculate the area of a circle with radius as a parameter.
//	Calculate the area of a triangle with base and height as parameters.
	public static double calculateArea(double length, double breadth) {
		return length * breadth;
	}
	public static double calculateArea(double r) {
		return Pi*r*r;
	}
	public static double calculateArea(float base, float height) {
		return 0.5 * base * height;
	}
	public static void main(String[] args) {
		Shape s=new Shape();
		System.out.println("Area of Rectangle: " + calculateArea(5.1, 4.1));
		System.out.println("Area of circle: " + calculateArea(4.0));
		System.out.println("Area of triangle: " + calculateArea(2.0, 4.10));
	}
	
	
}
