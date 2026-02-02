class Solution {
    public int minimumCost(int[] nums) {
        if(nums.length<=3) return Arrays.stream(nums).sum();
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<min1){
                min2 = min1;
                min1 = nums[i];
            }else if(nums[i]<min2){
                min2=nums[i];
            }
        }
        return min1+min2+nums[0];
    }
}
// Intuition
// The problem asks us to split an array into three subarrays. The cost of this split is the sum of the first elements of each subarray.
// Since the first subarray must start at nums[0], the first element of our total cost is always fixed as nums[0].
// To minimize the total cost, we need to pick two other indices in the remaining part of the array such that the values at those indices are the smallest possible.
// Essentially, the problem boils down to finding the two smallest elements in the array excluding the very first element.
// Approach
// Store the first element of the array in startElement.
// Initialize two variables, firstMin and secondMin, to Integer.MAX_VALUE to keep track of the two smallest values found so far in the rest of the array.
// Iterate through the array starting from index 1 to the end:
// If the current element nums[i] is smaller than firstMin, then the previous firstMin becomes the secondMin, and firstMin is updated to the current element.
// Otherwise, if the current element is smaller than secondMin (but greater than or equal to firstMin), update secondMin to the current element.
// After the loop, the minimum cost is the sum of startElement, firstMin, and secondMin.
// Return the calculated total cost.
// Complexity
// Time complexity: O(n)

// Space complexity: O(1)