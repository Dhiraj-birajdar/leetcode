import java.util.Arrays;
class Solution {
    public int minOperations(int[] nums, int k) {
        // return Arrays.stream(nums).sum()%k;
        for(int i=1;i<nums.length;i++)nums[0]+=nums[i];
        return nums[0]%k;
    }
}

// 🤔 Approach
// Step 1: Calculate Total Sum
// Add all numbers together to get the total.

// Step 2: Find the “Leftover”
// When you divide total by k, whatever is "left over" (remainder) is exactly how much you need to remove.

// Step 3: That's Your Answer!
// ➡️ The remainder = Number of operations needed.