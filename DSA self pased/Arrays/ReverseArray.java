
//Time complexity - O(n)
//Space complexity - O(1)

public class ReverseArray {
    static void reverse(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int n = arr.length;
        System.out.println(reverse(arr, n));
    }
}
