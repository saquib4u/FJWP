package lab11;

import java.util.concurrent.*;


class MyCallable implements Callable {
    int num;

    // Constructor to initialize the value of num
    public MyCallable(int num) {
        this.num = num;
    }

    // Override the call method to calculate the sum of the first num numbers
    @Override
    public Object call() throws Exception {
        // Print the name of the thread responsible for the calculation
        System.out.println(Thread.currentThread().getName() + ".. is responsible to find the sum of first " + num + " numbers");
        int sum = 0;
        
        // Calculate the sum of the first num numbers
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        // Return the calculated sum
        return sum;
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        // Create an array of MyCallable objects with different values of num
        MyCallable[] jobs = {
            new MyCallable(10),
            new MyCallable(20),
            new MyCallable(30),
            new MyCallable(40),
            new MyCallable(50),
            new MyCallable(60),
        };

        // Create an ExecutorService with a fixed thread pool of size 3
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submit the MyCallable objects to the ExecutorService and print the results
        for (MyCallable job : jobs) {
            // Submit the job and get a Future object
            Future f = service.submit(job);
            // Print the result of the calculation
            System.out.println(f.get());
        }

        // Shut down the ExecutorService
        service.shutdown();
    }
}