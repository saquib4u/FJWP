package june14;
//Create a class named Counter with a single static integer variable count. Implement two methods:
//public static void increment(): This method increases the value of count by 1.
//public static int getCount(): This method returns the current value of count.
//Test your code:
//In your main method, create multiple Counter objects (say 3).
//Call the increment() method on each object a few times (say 5).
//Finally, use the getCount() method to print the final value of count.
//Expected behavior:
//Even though you created multiple Counter objects, the count variable should be shared between them due to it being static. So, the final printed value should reflect the total number of increments across all objects.

public class Counter {
    private static int count = 0;

    public static void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        for (int i = 0; i < 5; i++) {
            counter1.increment();
            counter2.increment();
            counter3.increment();
        }

        System.out.println(Counter.getCount());
    }
}
