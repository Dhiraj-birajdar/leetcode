class Solution {
    public int mySqrt(int x) {
        long mid = 0;
        int i =1, j=x/2;
        if(x ==1) return 1;
        while(i<=j){
            mid = i+(j-i)/2;
            if(mid*mid == x)
                return (int)mid;
            else if(mid*mid > x)
                j = (int) (mid-1);
            else if(mid*mid <= x)
                i = (int) (mid+1);
        }
        return j;
    }
}