package lab19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Mapping Write a Java method that takes a list of strings as input and returns a new list containing the strings in uppercase using the Stream API.

//Example Input: ["hello", "world", "java"] Expected Output: ["HELLO", "WORLD", "JAVA"]
public class ConvertToUpperCase {

	public static void main(String[] args) {
		List<String> stringList=new ArrayList<>();
		stringList.add("hello");
		stringList.add("world");
		stringList.add("java");
		System.out.println("original List:"+ stringList);
		
		List<String> uppercaseList = stringList.stream()
				.map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println("Uppercase List: " + uppercaseList);
	}

}
