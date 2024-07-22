package july10;
////Write a Java program to find the first non-repeating character in a given string.
//Input: str = "aabbcde" Output: c
public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str="aabbcde";
//		int[] charCount = new int[256]; 
//
//        for (int i = 0; i < str.length(); i++) {
//            charCount[str.charAt(i)]++;
//        }
//
//        
//        for (int i = 0; i < str.length(); i++) {
//            if (charCount[str.charAt(i)] == 1) {
//                System.out.println(str.charAt(i));
//                break;
//            }
//        }
        int[] charCount=new int[str.length()];
        for(int i=0; i<str.length(); i++) {
        	charCount[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
	}

}
