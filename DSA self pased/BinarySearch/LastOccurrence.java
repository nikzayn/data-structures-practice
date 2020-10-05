public class LastOccurrence {
    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static int lastCccurenceNaive(int arr[], int x) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Time Complexity - O(logn)
    // Space Complexity - O(n)
    public static int lastOccurrenceRecursive(int arr[], int low, int high, int x, int n) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] < x) {
            return lastOccurrenceRecursive(arr, mid + 1, high, x, n);
        } else if (arr[mid] > x) {
            return lastOccurrenceRecursive(arr, low, mid - 1, x, n);
        } else {
            if (mid == n - 1 || arr[mid + 1] != arr[mid]) {
                return mid;
            } else {
                return lastOccurrenceRecursive(arr, mid + 1, high, x, n);
            }
        }
    }

    public static int lastOccurrenceIterative(int arr[], int x, int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                if (mid == n - 1 || arr[mid + 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 34, 12, 34, 67, 12, 78 };
        int n = arr.length;
        int x = 78;
        System.out.println(lastOccurrenceIterative(arr, x, n));
    }
}
