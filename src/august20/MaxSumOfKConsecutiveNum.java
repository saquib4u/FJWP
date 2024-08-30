package august20;

public class MaxSumOfKConsecutiveNum {

	public static void main(String[] args) {
		int[] arr= {12,7,6,4,98,23,45,78,90,5,33};
		int n =arr.length;
		int k=3;
		int sum=0;
		for(int i=0; i<k; i++) {
			sum += arr[i];//25
		}
		int max=sum;//25
		for(int i=k; i<n; i++) {
			sum -= arr[i-k];//25-12=13,
			sum += arr[i];//13+6=19
			if(sum > max) {
				max=sum;//
			}
		}
		System.out.println(max);

	}

}
