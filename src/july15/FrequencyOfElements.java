package july15;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {

	public static void main(String[] args) {
		String s="ascasspc";
		//count frequency of character like a:2, s:3, c:2, p:1
		HashMap<Character, Integer> freq=new HashMap<>();
		for (char c : s.toCharArray()) {
            if (freq.containsKey(c)) {
                // If the character is already in the HashMap, increment its count
                freq.put(c, freq.get(c) + 1);
            } else {
                // If the character is not in the HashMap, add it with a count of 1
                freq.put(c, 1);
            }
        }
		
        for (Character key : freq.keySet()) {
            System.out.println(key + " " + freq.get(key));
        }
        //using entrySet
        for(Map.Entry<Character, Integer> e : freq.entrySet()) {
			System.out.println(e.getKey() +" " + e.getValue());
		}

	}

}
