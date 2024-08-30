package august21;

public class LargestSumSubArray {
	//Input: arr = {-2,-3,4,-1,-2,1,5,-3}
	//Output: 7
	public static void main(String[] args) {
		
		int[] arr= {-2,-3,4,-1,-2,1,5,-3};
		int n = arr.length;
        
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0; 
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println("Sum from index " + i + " to index " + j + " is " + sum);
                maxSum = Math.max(maxSum, sum); 
            }
        }

        System.out.println("Maximum sum is " + maxSum);

	}

}
