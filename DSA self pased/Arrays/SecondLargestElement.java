// public class SecondLargestElement {
//     // Naive solution
//     static int getLargest(int arr[], int n) {
//         int largest = 0;
//         for (int i = 1; i < n; i++) {
//             if (arr[i] > arr[largest]) {
//                 largest = i;
//             }
//         }
//         return largest;
//     }

//     static int secondLargest(int arr[], int n) {
//         int largest = getLargest(arr, n);
//         int res = -1;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != arr[largest]) {
//                 if (res == -1) {
//                     res = i;
//                 } else if (arr[i] > arr[res]) {
//                     res = i;
//                 }
//             }
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 3, 4, 6, 0, 90, 80, 100 };
//         int n = arr.length;
//         System.out.println(secondLargest(arr, n));
//     }
// }

public class SecondLargestElement {
    static int largestElement(int arr[], int n) {
        int largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = i;
            }
        }
        return largest;
    }

    static int secondLargestElement(int arr[], int n) {
        int largest = largestElement(arr, n);
        int result = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest) {
                if (result == -1) {
                    result = i;
                } else if (arr[i] > arr[result]) {
                    result = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 29, 40, 70, 80 };
        int n = arr.length;
        System.out.println(secondLargestElement(arr, n));
    }
}