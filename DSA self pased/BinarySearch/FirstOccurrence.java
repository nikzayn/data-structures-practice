//Find first occurrences

//Time Complexity - O(n)
//Space Complexity - O(1)
public class FirstOccurrence {
    public static int occurrenceNaive(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Time Complexity - O(logn)
    // Space Complexity - O(n)
    public static int occurrenceIterative(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    // Time Complexity - O(logn)
    // Space Complexity - O(1)
    public static int occurrenceRecursive(int arr[], int low, int high, int x) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] < x) {
            return occurrenceRecursive(arr, mid + 1, high, x);
        } else if (arr[mid] > x) {
            return occurrenceRecursive(arr, low, mid - 1, x);
        } else {
            if (mid == 0 || arr[mid - 1] != arr[mid]) {
                return mid;
            } else {
                return occurrenceRecursive(arr, low, mid - 1, x);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 15, 15, 14, 67, 67 };
        int x = 10;
        int n = arr.length;
        int low = 0, high = n - 1;
        System.out.println(occurrenceRecursive(arr, low, high, x));
    }
}
