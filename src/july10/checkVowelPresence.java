package july10;
//Write a Java program to check whether a given string contains all the vowels (a, e, i, o, u) at least once.

//Input: str = "hello" Output: false
public class checkVowelPresence {
	public static void main(String[] args) {
		//String str="hello";
		String str="Mozambique";
		if(str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u")) {
			System.out.println("true");
	}else {
		System.out.println("false");
	}
		
		
	}
}
