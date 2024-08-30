package lab10;
/* Problem statement:
	 create a common class in which there is fun1() this is taking a parameter of String name and 	printing welcome and after this fun1() will Thread.sleep(3000) and in the last this will print the 	name.
	there are two class which are same ThreadA and ThreadB extending the Thread class.
	these class have parameter of common c and String s and run method this method is calling fun1 of 	common class and this is passing as parameter string s in fun1.
	now create a common class and pass into these thread class and call start() method on both thread 	and observe the output.
 */
class Common {
  //Prints a welcome message, sleeps for 3 seconds, and then prints a goodbye message
	 public void fun1(String name) {
	     // Print a welcome message
	     System.out.println("Welcome " + name);
	     try {
	         // Sleep for 3 seconds
	         Thread.sleep(3000);
	     } catch (InterruptedException e) {
	         // Handle InterruptedException
	         e.printStackTrace();
	     }
	     // Print a goodbye message
	     System.out.println("Goodbye " + name);
	 }
}


class ThreadA extends Thread {
	 // Fields to store the Common object and the String parameter
	 Common c;
	 String s;
	
	 // Constructor to initialize the fields
	 ThreadA(Common c, String s) {
	     this.c = c;
	     this.s = s;
	 }
	
	 // Override the run method to call the fun1 method of the Common object
	 @Override
	 public void run() {
	     // Call the fun1 method, passing the String parameter
	     c.fun1(s);
	 }
}

class ThreadB extends Thread {
	 // Fields to store the Common object and the String parameter
	 Common c;
	 String s;
	
	 // Constructor to initialize the fields
	 ThreadB(Common c, String s) {
	     this.c = c;
	     this.s = s;
	 }
	
	 // Override the run method to call the fun1 method of the Common object
	 @Override
	 public void run() {
	     // Call the fun1 method, passing the String parameter
	     c.fun1(s);
	 }
}

public class Main {
	 public static void main(String[] args) {
	     // Create a Common object
	     Common common = new Common();
	     // Create two thread objects, passing the Common object and a String parameter
	     ThreadA threadA = new ThreadA(common, "Thread A");
	     ThreadB threadB = new ThreadB(common, "Thread B");
	     // Start both threads
	     threadA.start();
	     threadB.start();
	 }
}