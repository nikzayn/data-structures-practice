public class MaxSubArray {
    // O(n^2) Time | O(1) Space
    public static BruteForceApproach(int[] nums){
        int maxSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    // O(n) Time | O(1) Space Using DP Kadane Algorithm
    public static DPApproach(int[] nums) {
        int maxSum = nums[0], sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
            sum = Math.max(sum, 0);
        }
        return maxSum;
    }
}
