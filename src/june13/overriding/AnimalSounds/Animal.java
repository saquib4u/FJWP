package june13.overriding.AnimalSounds;
//Create a base class Animal with a method makeSound() that simply prints "Generic Animal Sound".
//Now, create subclasses like Dog, Cat, and Cow that inherit from Animal.
//Override the makeSound() method in each subclass to print their specific sounds (e.g., "Woof" for Dog, "Meow" for Cat, "Moo" for Cow).
//In your main method, create objects of each subclass and call their makeSound() method. Observe the output.

public class Animal {
	public void makeSound() {
		System.out.println("Generic Animal Sound");
		
	}
}
