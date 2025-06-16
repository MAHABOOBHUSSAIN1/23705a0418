public class Main {
    public static void main(String[] args) {
    
        Node head = new Node(100);
        Node node1 = new Node(200);
        Node node2 = new Node(300);
        Node node3 = new Node(400);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        
        head = insertAtBeginning(head, 50);

        
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;  
        head = newNode;       
        return head;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
