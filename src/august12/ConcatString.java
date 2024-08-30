package august12;

public class ConcatString {

	public static void main(String[] args) {
//		String s1="abc";
//		String s2="pqr";
//		String result=s1+s2;
		//String result=s1.concat(s2);
		StringBuilder sb =new StringBuilder("abc");
		sb.append("pqr");
		
		System.out.println(sb);

	}

}
