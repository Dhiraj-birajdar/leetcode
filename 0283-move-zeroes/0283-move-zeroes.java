class Solution {
    public void moveZeroes(int[] nums) {

        for(int i = 0, j = 1; j < nums.length;){

            while(nums[i]!=0 && i <nums.length-1) i++;
            j = i+1;
            while(j <nums.length && nums[j]==0) j++;

            if(j < nums.length){
                nums[i] = nums[j];
                nums[j] = 0;
            }

        }
    }
}