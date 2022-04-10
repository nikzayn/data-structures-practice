public class IfArraySorted {
    static boolean checkSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkEff(int arr[], int n) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 20, 100 };
        int n = arr.length;
        System.out.println(checkEff(arr, n));
    }
}