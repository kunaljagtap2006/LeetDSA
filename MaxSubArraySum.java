//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.

public class maxSubarraySum {
    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,1-4};
        System.out.println(maxSubArray(nums));

    }
    public static int maxSubArray(int[] nums) {
        int i = 0;
        int bestEnding = nums[0];
        int result = 0;
        for (i = 1; i < nums.length ; i++) {
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];
            bestEnding = Math.max(v1 , v2);
            result = Math.max(result , bestEnding);
        }
        return result;
    }
}
