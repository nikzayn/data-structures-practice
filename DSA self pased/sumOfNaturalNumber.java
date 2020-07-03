// Sum of N natural numbers

class sumOfNaturalNumbers {
    static int naturalNumbers(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(naturalNumbers(nums));
    }
}