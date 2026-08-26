class Solution {
    public static int lengthOfLongestSubstring(String s){
        int low = 0 , high = 0;
        int result = Integer.MIN_VALUE;

        Map<Character , Integer> frequency = new HashMap<>();

        for (high = 0; high < s.length(); high++) {
            char addChar = s.charAt(high);
            frequency.put(addChar , frequency.getOrDefault(addChar , 0) + 1);
            int k = (high - low) + 1;
            while (frequency.size() < k){
                char lowChar = s.charAt(low);
                frequency.put(lowChar , frequency.get(lowChar) - 1);

                if (frequency.get(lowChar) == 0){
                    frequency.remove(lowChar);
                }
                low++;
                k = (high - low) + 1;
            }
            int length = (high - low) + 1;
            result = Math.max(result , length);
        }
        if(result == Integer.MIN_VALUE){
            result = 0;
        }
        return result;

    }
}
