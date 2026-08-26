class Solution {
    public int totalFruit(int[] arr) {
        int low = 0 , high = 0;
        int result = -1;
        Map<Integer ,Integer> frequency = new HashMap<>();

        for ( high = 0; high < arr.length; high++) {
            int addNo = arr[high];
            frequency.put(addNo , frequency.getOrDefault(arr[high] , 0) + 1);

            while (frequency.size() > 2){
                int num2 = arr[low];
                frequency.put(num2 , frequency.get(num2) - 1);

                if (frequency.get(num2) == 0){
                    frequency.remove(num2);
                }
                low++;
            }
            int length = (high - low) + 1;
            result  = Math.max(result , length);
        }
        return result;
    }
}