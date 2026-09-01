class Solution {
     public static int squareOfDigit(int n){
        int sum = 0;
        while (n > 0){
          int num = n % 10;
          n = n / 10;
          sum = sum + (num * num);
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        int fast = n , slow = n;
        while (fast != 1){
            slow = squareOfDigit(slow);
            fast = squareOfDigit(fast);
            fast = squareOfDigit(fast);
            if (slow == fast && slow != 1) {
                return false;
            }
        } return true;
    }
}
