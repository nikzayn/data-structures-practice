public class MoveZeroesToEnd {
    static void moveToEndNaive(int arr[]) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 2, 3, 0, 4 };
        moveToEndNaive(arr);
        System.out.println("Arrays after pushing the zeroes to an end");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
