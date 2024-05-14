class Solution {
    public int maxArea(int[] height) {
        
        if(height.length == 2) return Math.min(height[0],height[1]);

        int l = 0, r = height.length-1, res = (r-l)*Math.min(height[l],height[r]);
        while(l<r){
            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
            res = Math.max(res, (r-l)*Math.min(height[l],height[r]));
        }        
        return res;
    }
}