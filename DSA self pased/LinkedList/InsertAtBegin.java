class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertAtBegin {
    static void insertNode(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertNode(head, 20);
        head = insertNode(head, 30);
        return 0;
    }
}
