package AsymptoticNotations;
// Get the sum of values with a check of divisibility by 2

class getCheckSum {
    static int sumCheck(int[] arr, int n) {
        if (n % 2 != 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println(sumCheck(arr, n));
    }
}