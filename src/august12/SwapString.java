package august12;

public class SwapString {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="pqr";
		System.out.println(s1 +" "+ s2);
		s1 = s1 + s2; 
        s2 = s1.substring(0, s1.length() - s2.length()); //s1=abcdpqr
        s1 = s1.substring(s2.length()); 
        System.out.println(s1 +" "+ s2);
        
//        StringBuilder sb1=new StringBuilder("abcd");
//        StringBuilder sb2=new StringBuilder("pqr");
//        sb1=
        
	}

}
