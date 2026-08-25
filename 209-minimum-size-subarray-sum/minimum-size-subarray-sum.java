class Solution {
    public int minSubArrayLen(int target, int[] nums) {
          int low = 0 , high = 0;// starting me;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        while (high < nums.length){
            sum = sum + nums[high];

            while (sum >= target){   // jab tak sum bda or equal ho ga tb low ko hta na hai;
                int length = (high - low) + 1;
                result = Math.min(result , length);
                sum = sum - nums[low];
                low++ ;
            }
            high++;  // fir se start kar na new element le ke;
        }
         if (result == Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }
}