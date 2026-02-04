class Solution {
    public int trap(int[] height) {
        // Intuition:
        // Water trapped at any index depends on the minimum of
        // the maximum height to its left and right.
        // Instead of precomputing leftMax/rightMax arrays,
        // we can use two pointers and keep track of these values on the fly.

        int count = 0;                 // Total trapped water
        int l = 0, r = height.length - 1; // Two pointers from both ends
        int leftMax = 0, rightMax = 0;    // Max height seen so far from left and right

        // Approach:
        // Move the pointer that has the smaller boundary (leftMax or rightMax),
        // because that side limits the water level.
        while (l < r) {
            // Update the maximums seen so far
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);

            if (leftMax <= rightMax) {
                // Left side is the limiting factor
                // Water trapped at l = leftMax - height[l]
                count += (leftMax - height[l]);
                l++;
            } else {
                // Right side is the limiting factor
                // Water trapped at r = rightMax - height[r]
                count += (rightMax - height[r]);
                r--;
            }
        }

        // Final result: total units of trapped rain water
        return count;
    }

    /*
     * Time Complexity: O(n)
     *   - Each index is visited at most once by either pointer.
     *
     * Space Complexity: O(1)
     *   - Only constant extra space is used.
     */
}
