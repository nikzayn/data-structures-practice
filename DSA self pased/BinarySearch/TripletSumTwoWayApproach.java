public class TripletSumTwoWayApproach {
    // Time Complexity - O(n^3)
    // Space Complexity - O(1)
    public static boolean tripetWayNaive(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Time Complexity - O(nlogn + n^2)
    // Space Complexity - O(n)
    public static boolean tripletWayEff(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            // if (tripletWayEff(arr, i + 1, n - 1, x - arr[i])) {
            // return true;
            // }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 54, 11, 2, 6, 7, 8, 13 };
        int n = arr.length;
        int x = 19;
        System.out.println(tripetWayNaive(arr, n, x));
    }
}
