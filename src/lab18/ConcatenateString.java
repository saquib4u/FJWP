package lab18;
//Create a program that reads a list of strings and concatenates them into a single string using the Stream API. Avoid using lambda expressions for concatenation.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateString {
	public static void main(String[] args) {
		//create list of string
		List<String> stringList = new ArrayList<>();
		stringList.add("Concatenate");
		stringList.add(" ");
		stringList.add("this");
		stringList.add(" ");
		stringList.add("String");

	    String concatenatedString = stringList.stream()
	            .collect(Collectors.joining());//concatenate string

	    System.out.println("Concatenated String: " + concatenatedString);
	}
	
}
