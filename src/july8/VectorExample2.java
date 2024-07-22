package july8;

import java.util.Vector;

public class VectorExample2 {
	public static void main(String[] args) {
		//create a Vector of integers
		Vector<Integer> v = new Vector<>();
		//add the following elements to it: 10, 20, 30, 40, 50.
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
      //Print the original Vector.
        System.out.println("Original Vector:");
        for (int i : v) {
            System.out.println(i);
        }
      //Remove the element at index 2 (30).
        v.remove(2);
      //Add a new element 35 at index 2.
        v.add(2, 35);
      //Print the modified Vector.
        System.out.println("Modified Vector: ");
        for (int i : v) {
            System.out.println(i);
        }
      //Check if the Vector contains the element 40.
        if(v.contains(40)) {
        	System.out.println("vector contains 40");
        }
      //Remove all elements from the Vector.
        v.clear();
      //Print the final Vector.
        System.out.println("Final Vector: ");
        for (int i : v) {
            System.out.println(i);
        }
        
        
	}
}
