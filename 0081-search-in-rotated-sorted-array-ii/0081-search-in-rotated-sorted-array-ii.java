class Solution {
    public boolean search(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++)
            if(target == nums[i])
                return true;
        return false;
    }
}