class Solution {
    //O(n) with O(1) memory
    public int[] __productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        int prefix=1;
        for(int i=0;i<n;i++){
            res[i] =prefix;
            prefix*=nums[i];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            res[i]*=suffix;
            suffix*=nums[i];
        }
        return res;
    }
    //O(n) with O(n) memory
     public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int prefix=1;
        for(int i = 0; i<n; i++){
            pre[i] = prefix;
            prefix*=nums[i];
        }
        int suffix=1;
        for(int i = n-1; i>=0; i--){
            suf[i] = suffix;
            suffix*=nums[i];
        }
        for(int i = 0; i<n; i++){
            nums[i] = pre[i]*suf[i];
        }
        return nums;
    }
}