//        Example 1:
//        Input: nums = [1,-2,3,-2]
//        Output: 3
//        Explanation: Subarray [3] has maximum sum 3.

public class maxSumCircularSubarray {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        System.out.println(maxSubarraySumCircular(nums));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int maxEnding = nums[0] , minEnding = nums[0];

        int maxSum = nums[0] , minSum = nums[0];

        int totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int restart = nums[i];

            int v1_max = maxEnding + nums[i];
            int v2_min = minEnding + nums[i];

            maxEnding = Math.max(restart, v1_max);
            minEnding = Math.min(restart, v2_min);

            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);

            totalSum += nums[i];
        }
        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }
        int circularSum = totalSum - minSum;
        return Math.max(maxSum, circularSum);
    }
}
