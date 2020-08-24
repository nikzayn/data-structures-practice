public class ReverseArray {
    // Time Complexity - O(n)
    // Space Complexity - Theta(n)
    static void reverse(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 21, 33, 52, 63, 78 };
        int n = arr.length;
        System.out.println(reverse(arr, n));
    }
}