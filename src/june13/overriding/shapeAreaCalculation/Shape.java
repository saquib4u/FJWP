package june13.overriding.shapeAreaCalculation;

//Design a base class Shape with an abstract method calculateArea() that should return the area (but its implementation remains empty).
//Create subclasses like Square and Circle extending Shape.
//Implement the calculateArea() method in each subclass with the specific area calculation formulas (area of square = side * side, area of circle = pi * radius * radius).
//In your main method, create objects of Square and Circle and call their respective calculateArea() methods. Print the resulting areas

public abstract class Shape {
	public abstract double calculateArea (double a);
}
