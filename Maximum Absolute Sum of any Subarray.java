/Example 1:
//Input: nums = [1,-3,2,3,-4]
//Output: 5
//Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.

//yaaha apne ko max or min dono find krna sirf max se kamm nhi hoga kyu min me (-ve) value ko but absolute ke case me wo bhi (+ve) ho jyga .so dono ko compare krna pdhega 
public class maximumAbsoluteSumSubarray {
    public static void main(String[] args) {
        int[] nums ={1,-3,2,3,-4};
        System.out.println(maxAbsoluteSum(nums));
    }

    public static int maxAbsoluteSum(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int result = 0;

        for (int i = 1; i < nums.length; i++) {
            int restart = nums[i];
            int v1_max = maxEnding + nums[i];
            int v2_min = minEnding + nums[i];

            maxEnding = Math.max(restart, Math.max(v1_max, v2_min));
            minEnding = Math.min(restart, Math.min(v1_max, v2_min));

            int maxAbs = Math.abs(maxEnding);
            int minAbs = Math.abs(minEnding);

            result = Math.max(Math.abs(result) , Math.max(maxAbs, minAbs));
        }
        return Math.abs(result);
    }
}
