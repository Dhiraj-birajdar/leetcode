class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        if(nums.length == 1)
            return 0;
        int[] up = new int[nums.length], down = new int[nums.length];
        up[0] = nums[0];
        down[nums.length-1] = nums[nums.length-1];
        for(int i = 1, j = nums.length-2; i<nums.length; i++, j--){
            up[i] = nums[i] + up[i-1];
            down[j] = down[j+1]+ nums[j] ;
        }
        if (down[1] == 0) return 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (up[i - 1] == down[i + 1]) {
                pivot = i;
                break;
            }
        }
        if(pivot == -1 && up[up.length - 2] == 0 ) return up.length-1;
        return pivot;
    }
}
