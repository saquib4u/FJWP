package linkedList.questions;

public class DeleteLastNode {

	public static void main(String[] args) {
		Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        System.out.print("Given Linked List: ");
        
        printList(head);
        
        head = deleteLast(head);

        System.out.print("\nLinked List after deleting last node: ");
        printList(head);

	}
	
	public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }
	public static Node deleteLast(Node head) {
//		Node cur=head;
//		Node prev=null;
//		while(cur.next!=null) {
//			prev=cur;
//			cur=cur.next;
//		}
//		prev.next=cur.next;
//		return head;
		Node sl=head;
		while(sl.next.next!=null) {
			sl=sl.next;
		}
		sl.next=null;
		return head;
	}

}
