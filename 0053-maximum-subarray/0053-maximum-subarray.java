class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            if(currentSum<0) currentSum=0;
            currentSum+=nums[i];
            maxSum= Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

//     Kadane’s Algorithm Explanation (Short & Simple)

// We keep two variables:

// currentSum → sum of the current subarray

// maxSum → maximum subarray sum found so far

// We iterate through the array and add each element to currentSum.
// If currentSum becomes negative, we reset it to 0 because a negative sum will only reduce the sum of any future subarray.
// At each step, we update maxSum with the maximum of maxSum and currentSum.

// We initialize maxSum with the first element to correctly handle cases where all numbers are negative.

// Time Complexity: O(n)
// Space Complexity: O(1)
    public int __maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}