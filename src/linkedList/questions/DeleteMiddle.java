package linkedList.questions;

public class DeleteMiddle {

	public static void main(String[] args) {
		Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        System.out.print("Given Linked List: ");
        
        printList(head);
        
        head = deleteMiddle(head);

        System.out.print("\nLinked List after deleting Middle element: ");
        printList(head);

	}
	public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }
	public static Node deleteMiddle(Node head) {
		Node slow=head;
		Node fast=head;
		Node prev = null;
		while(fast != null && slow.next != null) {
			fast=fast.next.next;
			prev=slow;
			slow=slow.next;
		}
		prev.next=slow.next;
		return head;
	}

}
