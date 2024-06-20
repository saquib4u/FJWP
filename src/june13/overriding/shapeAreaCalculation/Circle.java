package june13.overriding.shapeAreaCalculation;

public class Circle extends Shape{
	public double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}
}
