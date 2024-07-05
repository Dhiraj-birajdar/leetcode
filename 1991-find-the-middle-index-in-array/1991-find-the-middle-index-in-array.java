class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length==1) return 0;
        
        int[] ps = new int[nums.length], ss = new int[nums.length];
        ps[0]=nums[0];
        ss[nums.length-1] = nums[nums.length-1];
        for(int l=1, r=nums.length-2; l<nums.length;l++, r--){
            ps[l]=ps[l-1]+nums[l];
            ss[r]=ss[r+1]+nums[r];
        }
        if(ss[1]==0) return 0;
        for(int l=1; l<nums.length-1;l++){
            if(ps[l-1]==ss[l+1])
                return l;
        }
        if(ps[nums.length-2]==0) return nums.length-1;
        return -1;

    }
}
