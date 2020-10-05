// Binary Search Iterative Approach

//Time Complexity - OLogn
//Space Complexity - O(1)

public class BinarySearchIterative {
    public static int binaryIterative(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int n = arr.length;
        int x = 30;
        System.out.println(binaryIterative(arr, n, x));
    }
}