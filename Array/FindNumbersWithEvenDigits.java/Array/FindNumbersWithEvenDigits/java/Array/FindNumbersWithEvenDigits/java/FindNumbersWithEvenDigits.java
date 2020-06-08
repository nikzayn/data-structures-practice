// Given an array nums of integers, return how many of them contain an even number of digits.

class FindNumbersWithEvenDigits {
    public static int findEvenDigits(int[] nums) {
        int current = 0;
        for (int num : nums) {
            int count = 0;
            while (num != 0) {
                num = num / 10;
                count++;
            }
            if (count % 2 == 0) {
                current++;
            }
        }
        return current;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findEvenDigits(nums));
    }
}