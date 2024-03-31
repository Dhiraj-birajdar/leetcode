class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        pre[0] = nums[0];
        suf[nums.length-1] = nums[nums.length-1];
        for(int i = 1, j = nums.length-2; i<nums.length; i++,j--){
            pre[i] = pre[i-1]*nums[i];
            suf[j] = suf[j+1]*nums[j];
        }
        for(int i = 1; i<nums.length-1; i++){
            nums[i] = pre[i-1]*suf[i+1];
        }
        nums[0] = suf[1];
        nums[nums.length-1] = pre[nums.length-2];
        return nums;
    }
}