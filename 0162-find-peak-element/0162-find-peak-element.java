class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int l=0,r=nums.length-1,m;
        while(l<=r){
            m = l+(r-l)/2;
            if(nums[m]<nums[m+1]) l=m+1;
            else if(nums[m]<nums[m-1]) r=m-1;
            else return m;
        }
        //linear search
        // for(int i = 1;i<nums.length-1;i++){
        //     if(nums[i-1]<nums[i] && nums[i] > nums[i+1])
        //         return i;
        // }
        return -1;
    }
}


// Intuition
// We need to find ANY peak (not necessarily the highest). Key insight: if we're at position mid and nums[mid] < nums[mid+1], there MUST be a peak on the right (we keep going uphill until we hit one).

// Approach
// Use binary search - if mid element is smaller than its right neighbor, move right (peak guaranteed on right side). Otherwise move left.

// Complexity
// Time complexity: O(log n)
// Space complexity: O(1)
// Code Explanation
// Step 1: Initialize two pointers - left = 0 and right = nums.length - 1

// Step 2: Find middle index: mid = (left + right) / 2

// Step 3: Compare nums[mid] with nums[mid + 1]:

// If nums[mid] < nums[mid + 1]: Peak is on the right side → left = mid + 1
// Else: Peak is on the left side (or mid itself) → right = mid-
// Step 4: Repeat until left == right, then left is our peak index