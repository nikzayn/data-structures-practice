public class CountOccurrence {
    public static int occurrence(int arr[], int x) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count += 1;
            }
        }
        return count;
    }

    // public static int occurrenceBinarySearch(int arr, int low, int high, int x) {
    // int
    // }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 45, 34, 34, 12, 67, 78, 90, 22 };
        int x = 4;
        System.out.println(occurrence(arr, x));
    }
}
