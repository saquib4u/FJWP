package july15;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashSet1 {

	public static void main(String[] args) {
		HashMap<String , Boolean> mp  = new HashMap<>();
		mp.put("cat", true);
        mp.put("dog", false);
        mp.put("lion", true);

//        for (String k : mp.keySet()) {
//            System.out.println("Key: " + k + ", Value: " + mp.get(k));
//        }
        for( Map.Entry<String, Boolean> e : mp.entrySet()) {
        	System.out.println(e);
			System.out.println(e.getKey() +" " + e.getValue());
		}

	}

}
