package july8;

import java.util.ArrayList;

//Write a Java program to create an ArrayList of strings, add the following elements to it: "Apple", "Banana", "Cherry", "Date", "Elderberry". Then, perform the following operations:
//Print the original ArrayList.
//Remove the element at index 2 (Cherry).
//Add a new element "Fig" at index 2.
//Print the modified ArrayList.
//Check if the ArrayList contains the element "Banana".
//Remove all elements from the ArrayList.
//Print the final ArrayList.
public class Example2ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");
		list.add("Elderberry");
		System.out.println("Original ArrayList:");
		 for (String str : list) {
	            System.out.println(str);
	      }
		list.remove(1);
		System.out.println("After removing index 2 element:");
		 for (String str : list) {
	            System.out.println(str);
	      }
		 list.add(1, "Fig");
		 System.out.println("Inserting Fig at index 2");
		 for (String str : list) {
	            System.out.println(str);
	      }
		 for (String str : list) {
			 if(str=="Banana") {
				 System.out.println("Banana is there");
			 }
	            
	      }
		 list.clear();
		 System.out.println("After removing all elements");
		 for(String str:list) {
			 System.out.println(str);
		 }
		
	}
}
