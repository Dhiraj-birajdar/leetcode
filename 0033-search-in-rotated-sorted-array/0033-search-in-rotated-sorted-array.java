class Solution {
    public int search(int[] nums, int target) {

        for(int i = 0;i<nums.length;i++)
            if(target == nums[i])
                return i;
        return -1;


        // if(nums.length ==1 && target == nums[0])
        //     return 0;
        // else if(target != nums[0])
        //     return -1;

        // int l = 0, r = nums.length-1;
        // while(l<=r){
        //     int m = l+(r-l)/2;
        //     if(nums[m] == target)
        //         return m;
        //     else if(nums[m] < target)
        //         r = m;
        //     else
        //         l = m+1;
        // }
        // return -1;
    }
}