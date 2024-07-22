package july9.string;
//Write a Java program to reverse a String.

public class ReversString {
	public static void main(String[] args) {
		String s="reverse";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev += s.charAt(i);
		}
		System.out.println(rev);
	}
}
