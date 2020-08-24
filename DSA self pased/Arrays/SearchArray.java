// Time Complexity - O(n)

public class SearchArray {
    static int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 7, 89, 32, 231 };
        int n = arr.length;
        int x = 231;
        System.out.println(search(arr, n, x));
    }
}