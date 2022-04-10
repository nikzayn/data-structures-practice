class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

public class DeleteAtLast {
    static void deleteLast(Node head){
        if (head == null) return null;
        if (head.next == null) return null;
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    } 
}
