class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class DeleteAtBegin {
    static void deleteNode(Node head){
        if(head == null){
            return null;
        } else {
            return head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(null);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next = new Node(30);
    }
}
