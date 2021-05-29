public class RemoveDuplicates {
    // Time Complexity - O(n)
    // Space Complexity - O(n)
    public static int removeDupsNaive(int arr[], int n) {
        // Created an array which takes the length of an array
        int[] temp = new int[n];
        temp[0] = arr[0];
        int result = 1;

        // Checking here for duplicates
        for (int i = 1; i < n; i++) {
            if (temp[result - 1] != arr[i]) {
                temp[result] = arr[i];
                result++;
            }
        }

        for (int i = 0; i < result; i++) {
            arr[i] = temp[i];
        }
        return result;
    }

    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static int removeDupsEff(int arr[], int n) {
        int result = 1;
        for (int i = 1; i < n; i++) {
            if (arr[result - 1] != arr[i]) {
                arr[result] = arr[i];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 20, 30, 30, 40, 40, 41, 42, 43, 44, 44 };
        int n = arr.length;
        // System.out.println(removeDupsNaive(arr, n));
        System.out.println(removeDupsEff(arr, n));
    }
}