// public class SortArray {
//     // Naive Solution - Time Complexity - O(n^2)
//     static boolean sortNaive(int arr[], int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[i]) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     // Optmized solution - Time Complexity - O(n)
//     static boolean sortOptimise(int arr[], int n) {
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < arr[i - 1]) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 6, 8, 12, 15 };
//         int n = arr.length;
//         System.out.println(sortNaive(arr, n));
//         System.out.println(sortOptimise(arr, n));
//     }
// }

public class SortArray {
    // Time Complexity - O(n^2)
    static boolean naiveSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Time Complexity - O(n)
    static boolean effSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 54, 7, 88 };
        int n = arr.length;
        System.out.println(naiveSort(arr, n));
        System.out.println(effSort(arr, n));
    }
}