class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums[1]<nums[0]) return 0;
        if(nums[nums.length-2]<nums[nums.length-1]) return nums.length-1;
        for(int i = 1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i] && nums[i] > nums[i+1])
                return i;
        }
        return -1;
    }
}