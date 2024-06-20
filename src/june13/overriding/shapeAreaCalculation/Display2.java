package june13.overriding.shapeAreaCalculation;

public class Display2 {
	public static void main(String args[]) {
		Square square = new Square();
		Circle circle = new Circle();

        System.out.println("Area of Square: " + square.calculateArea(4.0));
        System.out.println("Area of Circle: " + circle.calculateArea(2.0));
	}
}
