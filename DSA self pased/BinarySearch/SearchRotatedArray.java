public class SearchRotatedArray {
    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static int searchRotateNaive(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Time Complexity - O(logn)
    // Space Complexity - O(n)
    public static int searchRotateEff(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[low] > arr[mid]) {
                if (x >= arr[low] && x < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (x > arr[mid] && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 23, 43, 45, 56, 67, 78, 89, 90 };
        int n = arr.length;
        int x = 24;
        System.out.println(searchRotateEff(arr, n, x));
    }
}