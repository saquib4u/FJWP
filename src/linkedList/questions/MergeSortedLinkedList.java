package linkedList.questions;

public class MergeSortedLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        System.out.print("Given Linked List: ");
        while(head.next!=null) {
        	head=head.next;
        }
        
        
        printList(head);

	}
	public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }
	

}
