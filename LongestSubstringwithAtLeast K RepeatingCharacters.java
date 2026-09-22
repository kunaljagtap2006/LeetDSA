class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;

        for (int target = 1; target <= 26; target++) {
            int[] freq = new int[26];
            int left = 0, right = 0;
            int unique = 0, countK = 0;

            while (right < s.length()) {
                int index = s.charAt(right) - 'a';

                if (freq[index] == 0)
                    unique++;

                freq[index]++;

                if (freq[index] == k)
                    countK++;

                right++;

                while (unique > target) {
                    int remove = s.charAt(left) - 'a';

                    if (freq[remove] == k)
                        countK--;

                    freq[remove]--;

                    if (freq[remove] == 0)
                        unique--;

                    left++;
                }

                if (unique == target && unique == countK)
                    ans = Math.max(ans, right - left);
            }
        }

        return ans;
    }
}
