class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l[] = new int[nums.length];
        int r[] = new int[nums.length];
        int ans[] = new int[nums.length];
        int temp=0;
        for(int i = 0;i<nums.length;i++)
        {
            try{
                l[i]= l[i-1]+nums[i-1];
            }catch(Exception e){
                l[i] = 0;
            }
        }
        for(int i = nums.length-1;i>-1;i--)
        {
            try{
                temp= temp+nums[i+1];
            }catch(Exception e){
                temp = 0;
            }
            r[i]=temp;
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=Math.abs(l[i]-r[i]);
        }
        return ans;
    }
}