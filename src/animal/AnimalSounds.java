package animal;

import java.util.Scanner;

abstract class Animal {
    abstract void displaySound();
}

class Dog extends Animal {
    @Override
    void displaySound() {
        System.out.println("Woof woof! You've got a furry friend!");
        System.out.println("The dog says: WOOF WOOF!");
    }
}

class Cat extends Animal {
    @Override
    void displaySound() {
        System.out.println("Meow! You've got a whiskery pal!");
        System.out.println("The cat says: MEOW MEOW!");
    }
}

class Lion extends Animal {
    @Override
    void displaySound() {
        System.out.println("Roar! You've got a mighty king!");
        System.out.println("The lion says: ROAR!");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        AnimalSounds animalSounds = new AnimalSounds();
        animalSounds.makeSound();
    }

    public void makeSound() {
        Scanner scanner = new Scanner(System.in);
        Animal animal = null;
        System.out.println("Hey little champ! Want to hear some animal sounds? \n");

        while (true) {
            
            System.out.println("Choose your favorite animal:");
            System.out.println("1. Doggy");
            System.out.println("2. Kitty");
            System.out.println("3. Lion King");
            System.out.println("4. Bye-bye!");
            System.out.print("\nEnter your choice 1 or 2 or 3 or 4:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    animal = new Dog();
                    break;
                case 2:
                    animal = new Cat();
                    break;
                case 3:
                    animal = new Lion();
                    break;
                case 4:
                    System.out.println("\nBye-bye, little champ! See you next time!");
                    return;
                default:
                    System.out.println("\nOops! Try again, little champ!");
                    continue;
            }

            animal.displaySound();
            System.out.println("\nWant to hear another one? \n");
        }
    }
}