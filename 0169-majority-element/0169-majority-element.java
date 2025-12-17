class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (result == nums[i])
                count++;
            else
                count--;
            if (count == 0) {
                result = nums[i];
                count++;
            }
        }
        return result;
    }
}