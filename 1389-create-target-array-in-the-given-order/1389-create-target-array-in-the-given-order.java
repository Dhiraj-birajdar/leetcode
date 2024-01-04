import java.util.Arrays;
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int ta[] = new int[nums.length];
        //for(int i=0;i<nums.length;ta[i]=-1,i++);
        Arrays.fill(ta, -1);
        int t;
        for(int i=0;i<nums.length;i++)
        {
            if(ta[index[i]]==-1)
                ta[index[i]] = nums[i];
            else
            {
                for(int j=nums.length-1;j>index[i];j--)
                {
                    ta[j] = ta[j-1];
                }
                ta[index[i]] = nums[i];
            }
        }
        return ta;
    }
}