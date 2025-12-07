class Solution {
    public int __removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int index =0;
        int c = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[index] && c==1){
                nums[++index]=nums[i];
                c=-1;
            }else if(c==-1 && nums[i]!=nums[index]){
                nums[++index]=nums[i];
                c=1;
            }else if(c==1 && nums[i]!=nums[index]){
                nums[++index]=nums[i];
                c=1;
            }
        }
        return index+1;
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;        
    }
}
//Solution: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/solutions/5792415/video-using-two-pointers-coding-exercise-twyg