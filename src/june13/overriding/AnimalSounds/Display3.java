package june13.overriding.AnimalSounds;

public class Display3 {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.makeSound();
		
		Cat c = new Cat();
		c.makeSound();
		
		Cow cow = new Cow();
		cow.makeSound();
		
		Animal a = new Animal();
		a.makeSound();
//		Cat c2 = new Animal();
//		c2.makeSound();
		
	}
}
