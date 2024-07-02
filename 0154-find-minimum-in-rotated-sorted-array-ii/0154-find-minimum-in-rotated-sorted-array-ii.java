class Solution {
    public int findMin(int[] nums) {
       // Arrays.sort(nums);
        // return nums[0];
        
        // int min = nums[0];
        // for(int i = 1;i<nums.length; i++){
        //     if(min>nums[i]){
        //         min = nums[i];
        //     }
        // }
        // return min;

        int l = 0;
        int r = nums.length-1;
        if(nums[l]<nums[r]){
            return nums[l];
        }
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid]==nums[r]){
                r--;
            }
            else if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else r=mid;
        }
        return nums[l];
    
    }
}