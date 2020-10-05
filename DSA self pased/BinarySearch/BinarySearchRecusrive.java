// Binary Search Recursive Approach

//Time Complexity - O(logn)
//Space Complexity - O(logn)

public class BinarySearchRecusrive {
    public static int binaryRecursive(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return binaryRecursive(arr, low, mid - 1, x);
            } else
                return binaryRecursive(arr, mid + 1, high, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 8, 7, 12, 78, 55 };
        int n = arr.length;
        int low = 0, high = n - 1;
        int x = 7;
        System.out.println(binaryRecursive(arr, low, high, x));
    }
}
