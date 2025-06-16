class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(100);
        Node node1 = new Node(200);
        Node node2 = new Node(300);
        Node node3 = new Node(400);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;                                                                                                                                                                                                                                                                                                                                                                                     qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq

        head = insertAtBeginning(head, 50);

        System.out.println("Original List:");
        printList(head);

        head = deleteNode(head, 300);  
        System.out.println("After deleting 300:");
        printList(head);

        head = deleteNode(head, 50);    
        System.out.println("After deleting 50:");
        printList(head);

        head = deleteNode(head, 999);  
        System.out.println("After trying to delete 999 (not in list):");
        printList(head);
    }

    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static Node deleteNode(Node head, int key) {
        if (head == null) {
            return null; 
        }

        
        if (head.data == key) {
            return head.next; // New head is the next node
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        
        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}