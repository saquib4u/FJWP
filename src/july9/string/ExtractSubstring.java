package july9.string;
//Write a Java program to extract a substring from a String using the substring() method.

public class ExtractSubstring {

	public static void main(String[] args) {
		
		String s="hello there";
		String sb1=s.substring(1,3);
		System.out.println(sb1);
		String sb2=s.substring(1);
		System.out.println(sb2);
		String sb3=s.substring(3);
		System.out.println(sb3);
		
	}

}
