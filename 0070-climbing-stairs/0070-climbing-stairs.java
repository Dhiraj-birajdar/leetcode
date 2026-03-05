class Solution {
    // ================================
    // APPROACH 4: SPACE OPTIMIZED DP
    // ================================
    //
    // Instead of storing the entire DP array,
    // keep only last two results
    //
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    //
    // Most optimal and preferred in interviews

    public int climbStairs(int n) {

        if (n <= 2)
            return n;

        int prev2 = 1; // ways to reach step 1
        int prev1 = 2; // ways to reach step 2

        for (int i = 3; i <= n; i++) {

            int curr = prev1 + prev2;

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    // ================================
    // APPROACH 3: BOTTOM-UP DP
    // ================================
    //
    // dp[i] = number of ways to reach step i
    //
    // dp[i] = dp[i-1] + dp[i-2]
    //
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int climbStairs3(int n) {

        if (n <= 2)
            return n;

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];

        }

        return dp[n];
    }

    // ================================
    // APPROACH 2: MEMOIZATION (TOP-DOWN DP)
    // ================================
    // Store previously computed results
    //
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int climbStairs2(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }

    private int helper(int n, int[] memo) {

        if (n <= 2)
            return n;

        if (memo[n] != 0)
            return memo[n];

        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);

        return memo[n];
    }

    // ================================
    // APPROACH 1: RECURSION (BRUTE FORCE)
    // ================================
    // Idea:
    // To reach step n:
    //  - you could come from (n-1) with 1 step
    //  - you could come from (n-2) with 2 steps
    //
    // So:
    // ways(n) = ways(n-1) + ways(n-2)
    //
    // Base cases:
    // ways(1) = 1
    // ways(2) = 2
    //
    // Time Complexity: O(2^n)
    // Space Complexity: O(n) recursion stack
    //
    // Problem: lots of repeated calculations

    public int climbStairs1(int n) {
        if (n <= 2)
            return n;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}