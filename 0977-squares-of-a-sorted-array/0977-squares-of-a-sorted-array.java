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
/*Optimized 2 pointer approach O(N) O(N)
    since we know -*- = + and nums is sorted so max values will always be at start or end
    we take 2 pointers pointing start and end (low,high)
    3rd pointer i at insertion position in ans array which will be at nums.length-1
    since we are taking max num from nums array to put at end of ans
    compare l and h by Math.abs() whichever is greater put in ans[i--]
    update l or h accordingly
*/

    //trivial O(n log n) O(1)
    public int[] _sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

// 🧠 Approach: Two Pointers
// 🔹 Key Insight
// Largest square comes from either:
// the leftmost (most negative) number, or
// the rightmost (largest positive) number
// Compare absolute values from both ends.

// 🔁 Algorithm
// Initialize:
// l = 0 (start pointer)
// h = n - 1 (end pointer)
// i = n - 1 (fill result from the back)

// While l <= h:
// Compare |nums[l]| and |nums[h]|
// Place the larger square at ans[i]
// Move the corresponding pointer
// Decrement i
// Return ans

// ⏱️ Complexity
// Time: O(n) (single pass)
// Space: O(n) (result array)

// 🎯 One-Line Revision Summary
// “Use two pointers to compare absolute values at both ends and fill the result array from right to left.”