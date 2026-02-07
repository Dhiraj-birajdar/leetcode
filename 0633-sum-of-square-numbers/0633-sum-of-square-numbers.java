class Solution {
    public boolean judgeSquareSum(int c) {
        /*
         * Intuition:
         * We need to check if there exist two integers a and b such that:
         * a^2 + b^2 = c
         * Since squares grow monotonically, we can use a two-pointer technique
         * instead of checking all pairs (which would be slow).
         */

        /*
         * Approach:
         * 1. Let r be the largest possible value such that r^2 <= c (i.e., sqrt(c)).
         * 2. Let l = 0.
         * 3. While l <= r:
         *    - Compute sum = l^2 + r^2
         *    - If sum == c, return true
         *    - If sum > c, decrement r to reduce the sum
         *    - If sum < c, increment l to increase the sum
         * 4. If no such pair is found, return false.
         */

        int n = (int) Math.sqrt(c);

        // Two pointers: l starts from 0, r starts from sqrt(c)
        for (long l = 0, r = n; l <= r; ) {
            long sum = l * l + r * r;

            if (sum == c) return true;
            else if (sum > c) r--; // decrease larger square
            else l++;              // increase smaller square
        }

        /*
         * Time Complexity:
         * O(sqrt(c)) — each pointer moves at most sqrt(c) times.
         *
         * Space Complexity:
         * O(1) — constant extra space.
         */

        return false;
    }
}
