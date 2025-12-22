import java.util.Arrays;
class Solution {
    public int minOperations(int[] nums, int k) {
        // return Arrays.stream(nums).sum()%k;
        for(int i=1;i<nums.length;i++)nums[0]+=nums[i];
        return nums[0]%k;
    }
}