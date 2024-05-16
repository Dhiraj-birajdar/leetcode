class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0, l = 0, r = nums.length-1;
        while(l<r){
            if(nums[l] + nums[r] > k)
                r--;
            else if(nums[l] + nums[r] < k)
                l++;
            else{
                res++;
                l++;
                r--;
            }
        }
        return res;
    }
}