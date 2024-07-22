package july9.string;
//Write a Java program to count the number of occurrences of a specific character in a String.
public class CountOccurrences {
	public static void main(String[] args) {
		String s="hello world";
		char c='o';
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(count);
	}
}
