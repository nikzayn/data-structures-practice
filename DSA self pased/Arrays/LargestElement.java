public class LargestElement {
    // Efficient solution - Time Complexity - O(n)
    static int largestNaive(int arr[]) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > index) {
                index = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 60, 90, 20 };
        System.out.println(largestNaive(arr));
    }
}