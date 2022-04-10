public class RemoveDuplicates {
    // Time Complexity - O(n)
    // Space Complexity - O(1)
    static int removeDupsEff(int arr[], int n) {
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    // Time Complexity - O(n)
    // Space Complexity - O(n)
    static int removeDupsNaive(int arr[], int n) {
        int temp[] = new int[n];
        temp[0] = arr[0];
        int res = 1;

        for (int i = 1; i < n; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }

        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int n = arr.length;
        System.out.println(removeDupsEff(arr, n));
    }
}