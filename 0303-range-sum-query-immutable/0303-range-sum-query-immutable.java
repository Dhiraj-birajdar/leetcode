class NumArray {
    private int[] prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length+1];
        prefixSum[0]=0;
        for(int i=0;i<nums.length;i++){
            prefixSum[i+1] = nums[i]+prefixSum[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefixSum[right+1]-prefixSum[left];
    }
}
// 1,2,3,4,5 nums
// 1,3,6,10,15 prefixSum
// 15,14,12,9,5
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

//  Intuition
// We need to answer many range sum queries on a static array. Recomputing the sum for every query would be slow, so the natural idea is to preprocess the array into a prefix sum array that allows any range sum to be computed in constant time.

// Approach
// Build a prefix sum array arr where:
// arr[i] stores the sum of the first i elements.
// arr[0] = 0 by convention.
// For a query [left, right], the sum is: [arr[right+1]−arr[left]]
// This works because the prefix sum up to right contains everything before it, and subtracting the prefix sum up to left - 1 removes the part we don't want.
// Complexity
// Time complexity: Preprocessing: O(n) + Each query: O(1)

// Space complexity: O(n) for storing the prefix sum array.