package june13.overriding.accessModifier;

//Create a class Vehicle with a private method startEngine().
//Now, design a subclass Car inheriting from Vehicle.
//Try overriding the startEngine() method in Car with public access.
//Compile your code and observe the error. Discuss why overriding with a less restrictive access modifier (private to public) is not allowed.

public class Vehicle {
	private void startEngine(){
		System.out.println("Vehicle's engine started");
	}
}
