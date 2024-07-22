package july8;

import java.util.Vector;

public class ExmapleVector {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Elderberry");
        
        System.out.println("Vector elements:");
        for (String element : vector) {
            System.out.println(element);
        }
	}
}
