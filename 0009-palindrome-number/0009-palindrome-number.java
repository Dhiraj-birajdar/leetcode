class Solution {
    public boolean isPalindrome(int x) {
        int n = 0;
        for(int i = x; i>0; i/=10)
            n = n*10 + i%10;
        return x == n;
    }
}