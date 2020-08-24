public class DeleteArray {
    static int delete(int arr[], int n, int x) {

        // Traverse over the array
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        // If index is equal to the size of array
        if (i == n) {
            return n;
        }

        // Traverse to the second last value of the array
        for (int j = i; j < n - 1; j++) {
            arr[i] = arr[i + 1];
        }
        return (n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 7, 8, 19, 10 };
        int n = arr.length;
        int x = 5;
        System.out.println(delete(arr, n, x));
    }
}