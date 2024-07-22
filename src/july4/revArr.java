package july4;

public class revArr {
	//you task is to create array [10]and fill it  wil table 23  then reverse it  then preint then covert  the same same array into 17  table  then print
	public static void main(String[] args) {
		int[] arr=new int[10];
		int[] temp = new int[10];
		int k=1;
		for(int i=0; i<10; i++) {
			arr[i] = 23 * k;
			k++;
		}

		int n =arr.length;
		for(int i=0; i<10; i++) {
			temp[i]=arr[n-i-1];
			System.out.print(temp[i] +" ");
		}
		System.out.println();
		int m=1;
		for(int i=0; i<10; i++) {
			arr[i] = 17 * m ;
			if(i%2 != 0) {
				arr[i]=1;
			}
			m++;
			System.out.print(arr[i] +" ");
		}
	}
//	public static void reverseArray(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
	
	
}
