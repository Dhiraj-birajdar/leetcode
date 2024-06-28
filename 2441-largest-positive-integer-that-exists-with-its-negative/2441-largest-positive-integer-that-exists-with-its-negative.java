class Solution {
    public int findMaxK(int[] nums) {

        // if(nums.length == 1) return -1;
        
        Arrays.sort(nums);
        if(nums.length == 1 || (nums[0]<0 && nums[nums.length-1]<0) || (nums[0]>0 && nums[nums.length-1]>0)) return -1;

        for(int l=0, r=nums.length-1; l<r; ){
            if((nums[l]<0 && nums[r]<0) || (nums[l]>0 && nums[r]>0))
                return -1;
            if(nums[r]+nums[l]==0)
                return nums[r];
            if(Math.abs(nums[l]) < nums[r])
                r--;
            else
                l++;                     
        }
        return -1;
    }
}