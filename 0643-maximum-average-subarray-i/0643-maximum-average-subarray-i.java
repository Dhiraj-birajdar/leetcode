class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;sum+=nums[i++]);
        double max = sum/(double)k,temp;
        for(int i=1;i+k-1<nums.length;i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            temp = sum/(double)k;
            if(temp>max)
                max = temp;
        }
        return max;
    }
}