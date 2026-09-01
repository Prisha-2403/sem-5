package CollegeSem5;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList_reversal {
	
	 public static void printList(Node head) {
	        while (head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println();
	    }
	 
	 
    public static Node reverse(Node head,int k) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        int count = k;
        while (current != null && k>0) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current;      // Move prev one step forward
            current = next;      // Move current one step forward
            k--;
        }
        k=count;
        
        Node n=prev;
        while(count>1) {
        	n = n.next;
        	count--;
        }
        n.next = current;
        return prev; // New head of the reversed list
    }

   

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4); 
        head.next.next.next.next = new Node(5);
        
        
        int k=2;
//        head = reverse(head,k);
        Node curr = head;
        Node newHead = null;
        boolean first = true;
        for(int i=0;i<5;i+=k) {
        	curr = reverse(curr,k);
        	if(first) {
        		first = false;
        		newHead = curr;
        	}
        	for(int j=0;j<k && curr.next!=null ;j++) {
        		curr = curr.next;
        		
        	}
        	
        }
        
        printList(newHead); // Output: 4 3 2 1
    }
}

