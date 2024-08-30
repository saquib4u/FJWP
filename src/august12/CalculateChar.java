package august12;

public class CalculateChar {

	public static void main(String[] args) {
		String s="Codin _!g";
		int ans= countChar(s);
		System.out.println(ans);

	}
	public static int countChar(String s) {
		int count=0;
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				count++;
			}
		}
		return count;
	}

}
