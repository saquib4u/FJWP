package august6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//if num is odd then add 5 to arr list and store into list
public class IntegerList {
	public static void main(String[] args) {
		ArrayList<Integer> arrList=new ArrayList<>();
		arrList.add(10);
		arrList.add(9);
		arrList.add(20);
		arrList.add(21);
		arrList.add(50);
		arrList.add(41);
		
		List<Integer> listOfNum = arrList.stream()
                .filter(a -> a % 2 != 0) 
                .map(a -> a + 5) 
                .collect(Collectors.toList());

        System.out.println(listOfNum);
		
	}
}
