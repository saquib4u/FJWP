package june14;
//Create a class named Calculator with two static integer variables: num1 and num2.
//Challenge: Use a static initialization block to assign values to num1 and num2 before any Calculator object is created.
//Test your code:
//In your main method, directly print the values of num1 and num2 without creating a Calculator object.
//Explanation:
//Static initialization blocks are executed only once, when the class is loaded into memory. This ensures the values are assigned before any object usage.

public class Calculator {
    static int num1;
    static int num2;

    static {
        num1 = 10;
        num2 = 20;
    }

    public static void main(String[] args) {
        System.out.println("num1: " + Calculator.num1);
        System.out.println("num2: " + Calculator.num2);
    }
}
