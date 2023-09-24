class Solution {
    public int[] buildArray(int[] nums) {
        int r[] = new int[nums.length];
        for(int i =0;i<nums.length;i++)
            r[i] = nums[nums[i]];
        return r;
    }
}