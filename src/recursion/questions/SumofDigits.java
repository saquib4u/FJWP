package recursion.questions;

public class SumofDigits {

	public static void main(String[] args) {
		int n=1234900875;
		//findSum(n);
		System.out.println(findSum(n));
	}
	private static int findSum(int n) {
		if(n==0) {
			return 0;
		}
		return n%10 + findSum(n/10);
		
	}

}
