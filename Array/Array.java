package Array;

@SuppressWarnings("unchecked")
public class Array<T> implements Iterable<T> {

    private T[] arr;
    private int len = 0; // length of the array intitally
    private int capacity = 0; // Actual array size

    public Array() {
        this(16);
    }

    // Array Constructor
    public Array(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    // Return array size
    public int size() {
        return len;
    }

    // Check if array is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Get the indexed values from array
    public T get(int index) {
        return arr[index];
    }

    // Set the indexed values in array
    public void set(int index, T elem) {
        arr[index] = elem;
    }

    // Removes all the data in array and resets the length
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            arr[i] = null;
        }
        len = 0;
    }

    // To add the data in array and resize the array
    public void add(T elem) {
        if (len + 1 >= capacity) {
            if (capacity == 0) {
                capacity = 1;
            } else {
                capacity *= 2; // double the size
            }
            T[] new_arr = (T[]) new Object[capacity];
            for (int i = 0; i < len; i++) {
                new_arr[i] = arr[i];
            }
            arr = new_arr;
        }
        arr[len++] = elem;
    }

    // Removes the element at specific index in this list
    public T removeAt(int rm_index) {
        if (rm_index >= len && rm_index < 0)
            throw new IndexOutOfBoundsException();
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len - 1];
        for (int i = 0, j = 0; i < len; i++, j++) {
            if (i == rm_index) {
                j--; // Skip over rm_index by fixing j temporarily
            } else {
                new_arr[j] = arr[i];
            }
        }
        arr = new_arr;
        capacity = --len;
        return data;
    }

    // Check if the element is remove at the index of an array
    public boolean remove(Object obj) {
        for (int i = 0; i < len; i++) {
            if (arr[i].equals(obj)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    // Check if you find the index, otherwise return -1
    public int indexOf(Object obj) {
        for (int i = 0; i < len; i++) {
            if (arr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    // Check if the indexOf is not equal to -1
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    // Iterator is still fast but not as fast as iterative for the loop
    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            public boolean hasNext() {
                return index < len;
            }

            public T next() {
                return arr[index++];
            }
        };
    }

    @Override
    public String toString() {
        if (len == 0)
            return "[]";
        else {
            StringBuilder sb = new StringBuilder(len).append("[");
            for (int i = 0; i < len - 1; i++) {
                sb.append(arr[i] + ", ");
            }
            return sb.append(arr[len - 1] + "]").toString();
        }
    }

}