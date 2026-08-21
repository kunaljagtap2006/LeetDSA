class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  

        int maxDifference = Integer.MAX_VALUE;    //sab se bda number de diya
        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];
                int newDifference = Math.abs(threeSum - target);

                if (newDifference < maxDifference) {
                    maxDifference = newDifference;
                    result = threeSum;
                }
                if (threeSum == target) {
                    left++;
                    right--;
                } else if (threeSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        } return result;
    }
}