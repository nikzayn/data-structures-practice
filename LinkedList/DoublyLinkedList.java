import sun.jvm.hotspot.memory.HeapBlock.Header;

// Doubly Linked List Node

public class DoublyLinkedList<T> implements Iterable<T> {
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    // Internal node class to load data
    private class Node<T> {
        T data;
        Node<T> prev, next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    // Empty this linked list, O(n)
    public void clear() {
        Node<T> trav = head;
        while (trav != null) {
            Node<T> next = trav.next;
            trav.prev = trav.next = null;
            trav.data = null;
            trav.next = null;
        }
        head = tail = size = 0;
        size = 0;
    }

    // Return the size of linked list
    public int size() {
        return size;
    }

    // Check if linked list is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Add an element to the tail of the linked list, O(1)
    public void add(T elem) {
        addLast(elem);
    }

    // Add an element to the beginning of the linked list, O(1)
    public void addFirst(T elem) {
        // Check if linked list is empty
        if (isEmpty()) {
            head = tail = new Node<T>(elem, null, null);
        } else {
            head.prev = new Node<T>(elem, null, head);
            head = head.prev;
        }

        size++;
    }

    // Add a node to the tail of the linked list, O(1)
    public void addLast(T elem) {
        // Check if list is empty
        if (isEmpty()) {
            head = tail = new Node<T>(elem, null, null);
        } else {
            tail.next = new Node<T>(elem, tail, null);
            tail = tail.next;
        }
        size++;
    }

    // Check the value of the first node if it exists, O(1)
    public 

}
