package july8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {
	public static void main(String[] args) {
		//create an ArrayList of integers
		ArrayList<Integer> list=new ArrayList<>();
		//add the following elements to it: 10, 20, 30, 40, 50. 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//Print the original ArrayList.
		System.out.println("original arraylist:");
		for(int i:list) {
			System.out.println(i);
		}
		//Sort the ArrayList in ascending order.
		Collections.sort(list);
		//Print the sorted ArrayList.
		System.out.println("sorted arraylist:");
		for(int i:list) {
			System.out.println(i);
		}
		//Reverse the ArrayList.
		Collections.reverse(list);
		//Print the reversed ArrayList.
		System.out.println("reversed arraylist:");
		for(int i:list) {
			System.out.println(i);
		}
	}
}
