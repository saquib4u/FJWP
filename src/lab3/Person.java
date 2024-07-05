package lab3;

 class InvalidAgeException extends Exception {
	 public InvalidAgeException(String message) {
	        super(message);
	 }
 }


public class Person {

    private int age;

    public Person(int age) throws InvalidAgeException {

        if (age < 18 || age > 100) {
            throw new InvalidAgeException("Age must be between 18 and 100.");
        }
        this.age = age;
    }



    public static void main(String[] args) {

        try {
            System.out.println("Person with age 17");
            Person person1 = new Person(17);

            System.out.println("Person with age 19");
            Person person2 = new Person(19);

            System.out.println("Person with age 101");
            Person person3 = new Person(101);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}
