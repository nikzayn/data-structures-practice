public class countOnesBinaryArray {

    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static int countOnesNaive(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count += 1;
            }
        }
        return count;
    }

    // Time Complexity - O(logn)
    // Space Complexity - O(n)
    public static int countOnesFast(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] == 0) {
                    return n - mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 1, 1, 1, 1 };
        int n = arr.length;
        System.out.println(countOnesFast(arr, n));
    }
}
