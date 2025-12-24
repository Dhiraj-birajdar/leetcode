class Solution {
    public int minimumOperations(int[] nums) {
        int min=0;
        for(int i:nums) if(i%3!=0) min++;
        return min;
    }
}

/**
Intuition
To make a number divisible by 3, we only care about its remainder when divided by 3:
If a number is already divisible by 3 → no operation is needed.
If a number has remainder 1, we can subtract 1 to reach a multiple of 3.
If a number has remainder 2, we can add 1 to reach a multiple of 3.
In both cases (remainder 1 or 2), only one operation is needed.
Thus, each number that is not divisible by 3 contributes exactly 1 to the total operations.
Therefore, the total minimum operations is simply the count of numbers not divisible by 3.
Approach
Initialize a counter ans = 0.
Loop through each element in the array:
Compute nums[i] % 3.
If the result is not 0, increment ans because we need exactly one operation for this number.
Return ans as the minimum number of operations required.
Complexity
Time complexity:
O(n)

Space complexity:
O(1)
 */