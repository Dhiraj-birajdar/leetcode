class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // If k is greater than array length, rotating n times gives same array,
        // so we reduce k to the effective number of rotations
        //Modulo normalization: Reduce k to k % n to handle k > array length cases
        k = k % n;

        // If k becomes 0, array remains unchanged
        if (k == 0)
            return;

        /*
         * INTUITION:
         * To rotate the array to the right by k steps:
         * 1. Reverse the entire array
         * 2. Reverse the first k elements
         * 3. Reverse the remaining n-k elements
         *
         * This rearranges the elements into the correct rotated order
         */

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse elements between indices i and j
    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            // Swap elements at i and j
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            // Move pointers towards the center
            i++;
            j--;
        }
    }
}
