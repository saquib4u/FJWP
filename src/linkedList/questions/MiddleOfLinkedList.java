package linkedList.questions;


public class MiddleOfLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        System.out.print("Given Linked List: ");
        
        printList(head);
        
        System.out.println("\nMiddle element of given LinkedList is " + findMiddle(head));
        
	}
	public static int findMiddle(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast != null && slow.next != null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;

	}
	public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        
    }
}

