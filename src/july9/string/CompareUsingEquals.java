package july9.string;
//Write a Java program to compare two Strings using the equals() method.
public class CompareUsingEquals {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";
		String s3="Hello";
		String s4=new String("Hello");
		String s5=new String("Hello");
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s4.equals(s5));
	}
}
