class Solution {

    public boolean check(int[] nums) {
        // Approach / Intuition:
        // A sorted and rotated array can have at most ONE place
        // where nums[i] > nums[i+1].
        // We treat the array as circular by comparing the last element
        // with the first using (i + 1) % nums.length.
        // If the count of such breaks is more than 1, it is not valid.
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[(i + 1) % nums.length] < nums[i]) count++;
        }
        return count <= 1;
    }

    // my solution
    public boolean __check(int[] nums) {
        // Approach / Intuition:
        // Count how many times the order breaks inside the array
        // (nums[i-1] > nums[i]).
        // A valid sorted rotated array can have:
        // 1) No breaks -> already sorted
        // 2) One break -> valid rotation only if first element
        //    is greater than or equal to the last element.
        if (nums.length == 1) return true;

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) count++;
        }
        return count == 0 || (count == 1 && nums[0] >= nums[nums.length - 1]);
    }
}
