class Solution {
    public static void sortColors(int[] nums) {
        int numc[] = new int[3];
        for(int i = 0; i<nums.length; i++)
            numc[nums[i]]++;
        for(int i = 0, c = 0; i<numc.length; ++i){
            for(int j = c; c<numc[i]+j; c++){
                nums[c] = i;
            }
        }
    }
}