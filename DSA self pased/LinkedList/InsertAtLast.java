class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertAtLast {
    static void insertLast(Node head, int x){
        Node temp = new Node(x);
        if (head == null){
            return temp;
        }
        Node head = curr;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertLast(head, 10);
        head = insertLast(head, 20);
    }
}
