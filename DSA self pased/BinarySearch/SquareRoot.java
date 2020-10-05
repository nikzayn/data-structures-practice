public class SquareRoot {
    // Time Complexity - Theta(sqrt(x))
    // Space Complexity - O(1)
    public static int squareRootNaive(int x) {
        int i = 1;
        while (i * i <= x)
            i++;
        return (i - 1);
    }

    // Time Complexity - O(logx)
    // Space Complexity - O(n)
    public static int squareRootEff(int x) {
        int low = 0, high = x, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int msq = mid * mid;
            if (msq == x) {
                return mid;
            } else if (msq > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 80;
        System.out.println(squareRootEff(x));
    }
}
