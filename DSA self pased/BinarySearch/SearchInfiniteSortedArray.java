public class SearchInfiniteSortedArray {

    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static int searchInfiniteSortedNaive(int arr[], int x) {
        int i = 0;
        while (true) {
            if (arr[i] == x)
                return i;
            if (arr[i] > x)
                return -1;
            i++;
        }
    }

    public static int binarySearch(int arr[], int low, int high, int x) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binarySearch(arr, low, mid - 1, x);
        } else {
            return binarySearch(arr, mid + 1, high, x);
        }
    }

    public static int searchInfiniteSortedEff(int arr[], int x) {
        if (arr[0] == x)
            return 0;
        int i = 1;
        while (arr[i] < x) {
            i *= 2;
        }
        if (arr[i] == x)
            return i;
        return binarySearch(arr, i / 2 + 1, i - 1, x);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 40, 50 };
        int x = 50;
        System.out.println(searchInfiniteSortedNaive(arr, x));
    }
}
