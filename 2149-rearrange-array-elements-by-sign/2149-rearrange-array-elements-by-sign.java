class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int evenIndex=0, oddIndex=1;
        for(int i:nums){
            if(i>=0){
                ans[evenIndex]=i;
                evenIndex+=2;
            }else{
                ans[oddIndex]=i;
                oddIndex+=2;
            }
        }
        return ans;
    }
}

// Approach
// If we traverse the array then whenever the first positive number is encountered then put it on index 0 and then whenever the next positive number comes then we put on posindex/evenIndex + 2 and same for negative number whenever first number comes put it on index 1 and then whenever next no comes put it on negindex/oddIndex + 2

// Complexity
// Time complexity: O(n)
// Space complexity: O(n)