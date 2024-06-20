package june18Array;
import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {
		int []a = new int [5];
		a[0]=46;
		a[1]=13;
		a[2]=15;
		a[3]=44;
		a[4]=45;
		int[] rev = new int[a.length];
		int j=0;
		for(int i=a.length-1; i>=0; i--) {
			rev[i]=a[j];
			j++;
		}
		for(int i=0; i<rev.length; i++) {
			System.out.print(rev[i] + " ");
		}
		
	}
	
	
}
