public class LeaderInAnArray {
    // Time Complexity - O(n^2)
    // Space Complexity - O(1)
    static void leadersNaive(int arr[]) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 10, 7, 9, 4, 2, 3, 1 };
        System.out.println(leadersNaive(arr));
    }
}
