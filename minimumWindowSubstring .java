class Solution {
    public static boolean charMatch(int[] s , int[] t){
        for (int i = 0; i < 256; i++) {
            if (s[i] < t[i]){
                return false;
            }
        } return true;
    }

    public static String minWindow(String s, String t) {

        int[] charOfS = new int[256];
        int[] charOfT = new int[256];

        for (int i = 0; i < t.length(); i++) {
            charOfT[t.charAt(i)]++;
        }

        int high = 0 , low = 0;
        int result = Integer.MAX_VALUE;
        int start = -1;

        for ( high = 0; high < s.length() ; high++) {
            charOfS[s.charAt(high)]++;

            while (charMatch(charOfS , charOfT)){
                int length = (high - low) + 1;

                if (result > length){
                    result = length;
                    start = low;
                }
                charOfS[s.charAt(low)]--;
                low++;
            }
        }
        if (result == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start , start + result);
    }
}
