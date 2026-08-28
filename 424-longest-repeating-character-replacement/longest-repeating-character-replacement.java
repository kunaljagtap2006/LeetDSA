class Solution {
    public static int maxCharFind(int[] arr) {
       int maxCount = -1;
        for (int i = 0; i < 256; i++) {
            maxCount = Math.max(maxCount, arr[i]);
        }
        return maxCount;
    }

    public static int characterReplacement(String s, int k){
        int low = 0 , high = 0;
        int result = -1;
        int[] arr = new int[256];
        for (high = 0; high < s.length(); high++) {
            arr[s.charAt(high)]++;// array me high par value da li

            int length = (high - low) + 1 ;
            int maxLen = maxCharFind(arr);
            int diff = length - maxLen;

            while (diff > k){  // agr k se difference (length - maxLen) character ja da hua to low --;
                arr[s.charAt(low)]--;
                low++;
                maxLen = maxCharFind(arr);
                length = (high - low) + 1 ;
                diff = length - maxLen;

            }
            length =  (high - low) + 1 ;
            result = Math.max(result , length);
        }
        return result;
    }
}
