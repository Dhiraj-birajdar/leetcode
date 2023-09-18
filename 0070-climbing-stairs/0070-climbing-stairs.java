class Solution {
    public int climbStairs(int n) {

        int n1=0, n2=1, t, f;
        for(int i = 1;i<=n;i++)
        {
            t = n1+n2;
            n1 = n2;
            n2= t;
        }
        return n2;
    }
}