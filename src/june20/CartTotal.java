package june20;
import java.util.Scanner;
//sample input
//3
//100 20 40
//2 1 2

//sample output
//300
public class CartTotal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N =scn.nextInt();
		int[] price=new int[N];
		for(int i=0; i<N; i++) {
			price[i]=scn.nextInt();
		}
		int[] quantity=new int[N];
		for(int i=0; i<N; i++) {
			quantity[i]=scn.nextInt();
		}
		
		int cartT=0;
		for(int i=0; i<N; i++) {
			cartT += price[i]*quantity[i];
		}
		System.out.println(cartT);
	}
}
