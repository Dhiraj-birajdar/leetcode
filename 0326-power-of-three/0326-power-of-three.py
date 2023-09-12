class Solution:
    def isPowerOfThree(self, n: int) -> bool:

        if n==1: return True
        if n%3!=0: return False
        p,i=0,0
        while(p<n):
            p = 3**i
            if(p==n):
                return True
            i+=1
        return False