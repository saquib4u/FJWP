package linkedList.questions;

public class ReverselinkedList {

	public static void main(String[] args) {
		Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
        head.next.next.next = new Node(400);
        head.next.next.next.next = new Node(500);
        head.next.next.next.next.next = new Node(600);
        
        System.out.print("Given Linked List: ");
        printList(head);

        head = reverseLL(head);

        System.out.print("\nReversed Linked List: ");
        printList(head);

	}

	public static Node reverseLL(Node head) {
		Node cur=head, prev=null, N;
		while(cur!=null) {
			N=cur.next;
			cur.next=prev;
			prev=cur;
			cur=N;
		}
		return prev;
	}
	public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }

}
