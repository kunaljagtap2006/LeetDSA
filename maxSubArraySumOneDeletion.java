//Input: arr = [1,-2,0,3]
//Output: 4
//Explanation: Because we can choose [1, -2, 0, 3] and drop -2,
// thus the subarray [1, 0, 3] becomes the maximum value.

public class maxSubArraySumOneDeletion {
    public static void main(String[] args) {
        int[] arr = {1,-2,0,3};
        System.out.println(maximumSum(arr));
    }
    public static int maximumSum(int[] arr) {

        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE;
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int previousNoDel = noDelete;
            int previousOneDel = oneDelete;

            noDelete = Math.max(
                    noDelete + arr[i] ,
                    arr[i]);

            if (previousOneDel == Integer.MIN_VALUE) {
                oneDelete = previousNoDel;
            } else {
                oneDelete = Math.max(
                        previousNoDel,
                        previousOneDel + arr[i]
                );
            }

            result = Math.max(result , Math.max(noDelete , oneDelete));
        }
        return result;
    }
}
