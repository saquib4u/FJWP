package lab4;

public class ArrayIndexOutOfBoundsExceptionExample {
	    public static void main(String[] args) {

	        int[] arr = {1, 2, 3, 4, 5};

	        int index = 5;

	        try {
	            System.out.println("Element at index " + index + " is: " + arr[index]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Index " + index + " is out of bounds.");
	        }

	    }

}
