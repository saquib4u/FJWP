package july4.abstraction;

abstract class Vehicle1 {
	abstract void drive();
	public static void main(String[] args) {
		//Car1 c=new Car1();
		Motorcycle1 m=new Motorcycle1();
		m.drive();
		//c.drive();
	}

	
}
class car1 extends Vehicle1{
	public void drive() {
		System.out.println("Place hand on steering while driving using car");
	}
}
class Motorcycle1 extends Vehicle1{
	public void drive() {
		System.out.println("Place hand on handle while driving Bike");
	}
}