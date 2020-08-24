//Insert array in fixed sized array

//Time Complexity - O(n)
//Insert at the end - O(n)
//Insert at the beginning - theta(n)

public class InsertArray {
    static int insert(int arr[], int n, int x, int pos, int cap) {
        // If size of array is equal to the capacity
        if (n == cap) {
            return n;
        }
        // Get index
        int index = pos - 1;
        // Traverse over the array from last
        for (int i = n - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = x;
        return (n + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int x = 1;
        int pos = 4;
        int cap = 7;
        System.out.println(insert(arr, n, x, pos, cap));
    }
}