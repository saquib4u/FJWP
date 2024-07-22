package july9.stringBuffer;
//Write a Java program to reverse a given string using StringBuffer.

public class ReverseString {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Reverse me");
		System.out.println("Original String: "+ sb);
		System.out.println("Reversed String: " + sb.reverse());
	}
	
}
