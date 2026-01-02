class Solution {
    public int maxArea(int[] height) {
        // if(height.length == 2) return Math.min(height[0],height[1]);
        int maxCapacity = 0;
        for(int l=0,r=height.length-1;l<r;){
            int currentCapacity = (r-l)*Math.min(height[l],height[r]);
            maxCapacity = Math.max(currentCapacity,maxCapacity);
            if(height[l]<=height[r]) l++;
            else if(height[l]>height[r]) r--;
        }
        return maxCapacity;
    }
}
//use two-pointers. Set one pointer to the left and one to the right of the array. Always move the pointer that points to the lower line.