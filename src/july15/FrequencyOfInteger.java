package july15;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfInteger {
//{1,2,4,5,6,3,2,5,2,1,4,6,3,1,1}
	public static void main(String[] args) {
		int[] array = {1, 2, 4, 5, 6, 3, 2, 5, 2, 1, 4, 6, 3, 1, 1};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
