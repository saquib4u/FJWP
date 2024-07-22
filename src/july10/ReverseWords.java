package july10;

public class ReverseWords {
//reverse single words in sentence
	public static void main(String[] args) {
		String s="sharma is a good player and he is so punctual";
		String[] words = s.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
            String word = words[i];
            //String reversedWord = new StringBuilder(word).reverse().toString();
            //reverse(s);
            System.out.print(reverse(word) + " ");
            //System.out.print(reversedWord + " ");
        }
	}
        public static String reverse(String s) {
        	String rev ="";
        	for(int i=0; i<s.length(); i++) {
        		rev = s.charAt(i) + rev;
        	}
        	return rev;
        }

}
