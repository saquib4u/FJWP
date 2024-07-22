package july9.string;
//Write a Java program to trim the whitespace from a String using the trim() method.
public class TrimWhitespace {
	public static void main(String[] args) {
		String s="  Trim  my whitespace  ";
		System.out.println("Original String:\n"+ s);
		System.out.println(s.length());
		System.out.println("Trimmed string:");
		String s1=s.trim();
		System.out.println(s1);
		System.out.println(s1.length());
	}
}
