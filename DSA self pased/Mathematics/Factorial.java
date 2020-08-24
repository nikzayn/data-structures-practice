public class Factorial {
    static long factorialRecursive(final int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        final int n = 6;
        System.out.println(factorialRecursive(n));
    }
}