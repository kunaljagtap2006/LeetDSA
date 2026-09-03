//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.

public class maxSubArrayProduct {
    public static void main(String[] args) {
        int[] nums = {-2,3,-4};
        System.out.println(maxProduct(nums));

    }
    public static int maxProduct(int[] nums) {
        int i = 0;
        int minEnding = nums[0];
        int maxEnding= nums[0];
        int result = nums[0];

        for (i = 1; i < nums.length; i++) {
            int restart =  nums[i];
            int v1_min = nums[i] * minEnding;
            int v2_max = nums[i] * maxEnding;

            minEnding = Math.min(restart , Math.min(v2_max , v1_min));
            maxEnding = Math.max(restart , Math.max(v2_max , v1_min));

            result = Math.max(result , Math.max(maxEnding , minEnding));
        }
        return result;
    }
}
