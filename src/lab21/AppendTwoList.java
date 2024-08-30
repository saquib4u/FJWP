package lab21;
class Node {
    int data;
    Node next;

    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}
public class AppendTwoList {
	public static void main(String[] args) {
			
			Node head1 = new Node(22);
		    head1.next = new Node(33);
		    head1.next.next = new Node(44);
		    head1.next.next.next = new Node(55);
		    System.out.print("Given List1: ");
		    printList(head1);
		    
		    Node head2 = new Node(66);
		    head2.next = new Node(77);
		    head2.next.next = new Node(88);
		    head2.next.next.next = new Node(99);
		    System.out.print("\nGiven List2: ");
		    printList(head2);
		    
		    System.out.print("\nAfter appending list2 to list1: ");
		    printList(appendLL(head1, head2));
		    
		    
		}
	//function to append
	private static Node appendLL(Node head1, Node head2) {
		Node cur=head1;
		while(cur.next!=null) {
			cur=cur.next;
		}
		cur.next=head2;
		return head1;
	}
	//function to print Linked List
		private static void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
}
