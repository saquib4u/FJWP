package july9.string;
//Write a Java program to split a String into an array of substrings using the split() method.
public class SplitString {
	public static void main(String[] args) {
		String s = "Hello there! what's up";
        String[] sbs = s.split(" ");
        
        System.out.println("Original String: " + s);
        System.out.println("Split Substrings:");
        //using for each loop
        for (String i : sbs) {
            System.out.println(i);
        }
        //using for loop
        for(int i=0; i<sbs.length; i++) {
        	System.out.println(sbs[i]);
        }
	}
}
