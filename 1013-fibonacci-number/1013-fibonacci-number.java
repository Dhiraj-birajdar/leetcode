class Solution {
    public int fib(int n) {
        // return (n == 0 || n == 1)? n: fib(n - 1) + fib(n - 2); //One liner
        if(n==0) return 0;
        if(n<=2) return 1;
        int n1 =1,n2 = 1, n3=0;
        for(int i = 0; i<n-2;i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}