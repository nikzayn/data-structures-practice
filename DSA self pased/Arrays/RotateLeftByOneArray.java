// // Time Complexity - O(n)
// // Space Complexity - O(1)
// public class RotateLeftByOneArray {
// public static void rotateLeft(int arr[], int n) {
// // Create a temporary array
// int temp = arr[0];
// // Traverse over the array and change the index value from first to next
// for (int i = 1; i < n; i++) {
// arr[i - 1] = arr[i];
// }
// arr[n - 1] = temp;
// }

// public static void main(String[] args) {
// int arr[] = { 4, 5, 6, 7, 8 };
// int n = arr.length;
// System.out.println(rotateLeft(arr, n));
// }
// }