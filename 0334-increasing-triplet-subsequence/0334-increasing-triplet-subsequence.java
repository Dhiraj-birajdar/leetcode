class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length <= 2) return false;
        
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }
        
        return false;
    }
}