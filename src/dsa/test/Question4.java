package dsa.test;
//add last node into linked list
class Node{
	int data;
	Node next;
	Node(int new_data){
		this.data=new_data;
		this.next=null;
	}
}
public class Question4 {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		printList(head);
		addLastNode(head);
		printList(head);
	}

	private static Node addLastNode(Node head) {
		Node cur=head;
		while(cur.next != null) {
			cur=cur.next;
		}
		cur.next=new Node(5);
		return head;
		
	}

	private static void printList(Node node) {
		while(node != null) {
			System.out.print(node.data +" ");
			node=node.next;
		}
		System.out.println();
		
	}

}
