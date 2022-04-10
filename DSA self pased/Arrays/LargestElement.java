public class LargestElement {
    // Time Complexity - O(n ^ 2)
    // Space Complexity - O
    static int largestNaive(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                return arr[i];
            }
        }
        return -1;
    }

    static int largestEff(int arr[]) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 60, 30, 100 };
        System.out.println(largestNaive(arr));
        System.out.println(largestEff(arr));
    }

}