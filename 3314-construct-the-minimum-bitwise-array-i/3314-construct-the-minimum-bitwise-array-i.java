class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        int j=0;
        for(int n:nums){
            int i=0;
            while(i<n && (n!=(i|i+1))) i++;
            ans[j++]=i>=n?-1:i;
        }
        return ans;
    }
}