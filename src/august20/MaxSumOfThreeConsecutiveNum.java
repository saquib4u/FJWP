package august20;

public class MaxSumOfThreeConsecutiveNum {

	public static void main(String[] args) {
		int[] arr = {12,7,6,4,98,23,45,78,90,5,33};
		int g  = 3 ;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i <= arr.length - g; i++) {
            int currentSum = 0;						//0 
            for (int j = i; j < i + g; j++) {
                currentSum += arr[j]; //12 19 25, 7 13 17, 6 10 108, 4 102 125, 98 121 166, 23 68 146, 45 123 213, 78 168 173, 90 95 128
            }
            maxSum = Math.max(maxSum, currentSum);	//25 25 108 125 166 166 213 213 213
        }
        System.out.println(maxSum);

	}

}
