public class TwoWayApproach {
    // Time Complexity - O(n^2)
    // Space Complexity - O(1)
    public static boolean twoWayApproachUnsorted(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    // Time Complexity - O(n)
    // Space Complexity - O(n)
    public static boolean twoWayApproachSorted(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        while (low < high) {
            if (arr[low] + arr[high] == x) {
                return true;
            } else if (arr[low] + arr[high] > x) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 6, 90, 4, 5, 8, 16, 13 };
        int x = 9;
        System.out.println(twoWayApproachUnsorted(arr, x));
    }
}
