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

     public static void sortDutchColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // Swap nums[low] and nums[mid]
                    int temp0 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap nums[mid] and nums[high]
                    int temp2 = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp2;
                    high--;
                    break;
            }
        }
    }
}