class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int l=0,h=nums.length-1,i=h;l<=h;i--){
            if(Math.abs(nums[l])>=Math.abs(nums[h])){
                ans[i] = nums[l]*nums[l];
                l++;
            }else{
                ans[i] = nums[h]*nums[h];
                h--;
            }
        }
        return ans;
    }

    //trivial
    public int[] _sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}