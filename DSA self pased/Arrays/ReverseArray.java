
//Time complexity - O(n)
//Space complexity - O(1)

public class ReverseArray {
    static void reverse(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            swap(arr[low], arr[high]);
            // int temp = arr[low];
            // arr[low] = arr[high];
            // arr[high] = temp;
            low++;
            high--;
        }
    }

    static void swap(int low, int high) {
        int temp = low;
        low = high;
        high = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int n = arr.length;
        reverse(arr, n);
        System.out.println("After reversing the array");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
