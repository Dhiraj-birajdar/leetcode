class Solution {
    public void _sortColors(int[] nums) {
        int i0=0,i1=0,i2=0;
        for(int n:nums){
            if(n==0)i0++;
            else if(n==1)i1++;
            else i2++;
        }
        for(int i=0;i<i0;i++) nums[i]=0;
        for(int i=i0;i<i1+i0;i++) nums[i]=1;
        for(int i=i0+i1;i<i0+i1+i2;i++) nums[i]=2;
    }

    public void sortColors(int[] nums) {
        for(int l=0,m=0,r=nums.length-1;m<=r;){
            if(nums[m]==0){
              swap(nums,l,m);
              l++;  
              m++;
            }else if(nums[m]==2){
                swap(nums,r,m);
                r--;
            }else{
                m++;
            }
        }
    }

    private void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp; 
    }
}

// 🟦 Approach 1: Counting (Two-pass)
// Idea:
// Count how many 0s, 1s, and 2s, then overwrite the array in order.
// How it works:
// Traverse array once → count 0, 1, 2
// Traverse again → fill 0s, then 1s, then 2s

// Complexity:
// Time: O(n)
// Space: O(1) (only counters)
// Passes: 2

// Pros:
// Very simple
// Easy to reason about
// No tricky pointer logic
// Cons:
// Not one-pass
// Overwrites array completely
// Use when: clarity > optimality

// 🟩 Approach 2: Dutch National Flag (Three pointers, one-pass)
// Idea:
// Maintain three regions using pointers:
// l → next position for 0
// m → current element
// r → next position for 2

// How it works:
// If nums[m] == 0 → swap with l, move l, m
// If nums[m] == 2 → swap with r, move r (don’t move m)
// If nums[m] == 1 → just move m

// Invariant:
// [0 … l-1] -> 0s
// [l … m-1] -> 1s
// [m … r]   -> unknown
// [r+1 … n] -> 2s

// Complexity:
// Time: O(n)
// Space: O(1)
// Passes: 1

// Pros:
// Optimal
// In-place
// One pass

// Cons:
// Slightly tricky to implement correctly

// Use when: performance matters / interviews