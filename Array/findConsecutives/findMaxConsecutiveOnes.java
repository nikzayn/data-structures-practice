// Given a binary array, find the maximum number of consecutive 1s in this array.
package Array.findConsecutives;

class findMaxConsecutiveOnes {
    public static int maxConsecutive(int[] nums) {
        int max = 0, current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                }
                if (max >= nums.length / 2) {
                    return max;
                }
                current = 0;
            }
        }
        return Math.max(max, current);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1, 1 };
        System.out.println(maxConsecutive(nums));
    }
}
