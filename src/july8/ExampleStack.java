package july8;

import java.util.Stack;

//Stack after pushing 10: [10] Stack after pushing 20: [10, 20] Stack after pushing 30: [10, 20, 30] Stack after pushing 40: [10, 20, 30, 40] Stack after pushing 50: [10, 20, 30, 40, 50] Popped element: 50 Top element: 40 Stack is not empty: true Stack after clearing: []
//
//Your Task:
//
//Write a Java program to implement the above operations and produce the desired output.
public class ExampleStack {
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(10);
		System.out.println("Stack after pushing 10: "+st);
		st.push(20);
		System.out.println("Stack after pushing 20: "+st);
		st.push(30);
		System.out.println("Stack after pushing 30: "+st);
		st.push(40);
		System.out.println("Stack after pushing 40: "+st);
		st.push(50);
		System.out.println("Stack after pushing 50: "+st);
		
		System.out.println("Popped element: " + st.pop());
		
		System.out.println("Top element: " + st.peek());
		
		
		st.clear();
		System.out.println("Stack is not empty: " + st.isEmpty());
		System.out.println("stack after clearing: "+ st);
		
	}
}
