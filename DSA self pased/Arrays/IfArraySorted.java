public class IfArraySorted {
    public static boolean sortedNaive(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sortedEff(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[n - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 50, 5 };
        int n = arr.length;
        System.out.println(sortedNaive(arr, n));
        System.out.println(sortedEff(arr, n));
    }
}