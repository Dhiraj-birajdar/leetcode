class Solution {
    public static void sortColors(int[] nums) {
        // int c0 = 0, c1= 0, c2 = 0;
        int numc[] = new int[3];
        for(int i = 0; i<nums.length; i++)
            numc[nums[i]]++;
        // for(int i: numc)
        // System.out.print(i+", ");
        for(int i = 0, c = 0; i<numc.length; ++i){
            for(int j = c, k=j; j<numc[i]+k; j++,c++){
            //   System.out.println("j : "+j+"  c : "+c);
                nums[j] = i;
            }
        }
    }
}