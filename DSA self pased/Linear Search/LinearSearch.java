// Linear search

class LinearSearch {
    public static int search(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int x = 4;

        System.out.println(search(arr, n, x));
    }
}