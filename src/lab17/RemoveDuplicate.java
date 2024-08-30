package lab17;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//make list of string and remove duplicates from it
public class RemoveDuplicate {
	public static void main(String[] args) {
		//create list of string
		List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");
        list.add("Date");
        
        //use set to remove duplicate elements
        Set<String> uniqueSet = list.stream()
                .collect(Collectors.toSet());//store unique elements

        System.out.println("Original List: " + list);
        System.out.println("Set without duplicates: " + uniqueSet);
	}
}
