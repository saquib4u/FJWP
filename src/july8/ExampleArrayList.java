package july8;

import java.util.ArrayList;

public class ExampleArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("s1");
		list.add("s2");
		list.add("s3");
		list.add("s4");
		list.add("s5");
		list.add("s6");
		list.add("s7");
		list.add("s8");
		list.add("s9");
		list.add("s10");
		
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("removing element");
        list.remove(5);
        for (String str : list) {
            System.out.println(str);
        }
        
//        for(int i: list) {
//        	System.out.println(list.get(i));
//        }
//        list.remove(3);
//        for(int i: list) {
//        	System.out.println(list.get(i));
//        }
	}
}
