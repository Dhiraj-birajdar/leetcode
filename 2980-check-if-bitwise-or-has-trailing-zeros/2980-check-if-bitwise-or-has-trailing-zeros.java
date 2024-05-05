class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int c=0;
        for(int e: nums){
            c+=  (e&1) ==0? 1: 0;
            if( c==2) return true;
        }
        return false;
    }       
}