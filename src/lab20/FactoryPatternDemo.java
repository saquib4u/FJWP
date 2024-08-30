package lab20;

//Interface for shapes
interface Shape {
	void draw();
}

//Concrete class for Circle
class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

//Concrete class for Square
class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Square");
	}
}

//Concrete class for Triangle
class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Triangle");
	}
}

//Shape Factory
class ShapeFactory {
	public static Shape createShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		return null;
	}
}

//Client program to demonstrate the usage of the factory
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// Create a Circle object using the factory
		Shape circle = shapeFactory.createShape("CIRCLE");
		circle.draw();

		// Create a Square object using the factory
		Shape square = shapeFactory.createShape("SQUARE");
		square.draw();

		// Create a Triangle object using the factory
		Shape triangle = shapeFactory.createShape("TRIANGLE");
		triangle.draw();
	}
}