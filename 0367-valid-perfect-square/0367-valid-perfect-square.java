class Solution {
    public boolean isPerfectSquare(int num) {
        // if(num == 1) return true;
        // for(int i = 1; i<=num/2; i++)
        //     if(i*i==num)
        //         return true;
        // return false;
        
        if(num == 1)return true;
        for(int i=1, j=num/2; i<=j;){
            long mid = (j-i)/2 + i;
            if(mid * mid == num)
                return true;
            else if(mid*mid > num)
                j = (int) mid-1;
            else if(mid * mid <= num)
                i = (int)mid+1;
        }
        return false;
    }
}