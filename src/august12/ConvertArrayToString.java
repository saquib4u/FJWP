package august12;

import java.util.Arrays;

public class ConvertArrayToString {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		String s = Arrays.toString(arr);
		fun(s," ","");
		fun(s,",","");
		
	}
	public static void fun(String s, String s1, String s2) {
		String res=s.replaceAll(s1,s2);
		System.out.println(res);
	}

}
