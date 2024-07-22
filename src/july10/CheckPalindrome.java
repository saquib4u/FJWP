package july10;

public class CheckPalindrome {
	public static void main(String[] args) {
		String s1="naman";
		//String s1="car";
		for(int i= 0; i<s1.length(); i++) {
			if(s1.charAt(i) != reverse(s1).charAt(i)) {
				System.out.println(s1 + " is not Palindrome");
			}
		}
		System.out.println(s1+" is Palindrome");
	}

	private static String reverse(String s1) {
		String rev ="";
    	for(int i=0; i<s1.length(); i++) {
    		rev = s1.charAt(i) + rev;
    	}
    	return rev;
	}
}
