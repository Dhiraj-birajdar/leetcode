class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = nums[0];
        suf[n-1] = nums[n-1];
        for(int i = 1, j = n-2; i<n; i++,j--){
            pre[i] = pre[i-1]*nums[i];
            suf[j] = suf[j+1]*nums[j];
        }
        for(int i = 1; i<n-1; i++){
            nums[i] = pre[i-1]*suf[i+1];
        }
        nums[0] = suf[1];
        nums[n-1] = pre[n-2];
        return nums;
    }
}