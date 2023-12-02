class Solution:
    def isUgly(self, n: int) -> bool:
        if n<=0: return False
        # if n==1 or n%4 == 0:return True
        while n%2==0: n/=2
        while n%3==0: n/=3
        while n%5==0: n/=5
        return n==1
        # for i in range(2,int(n/2)+1):
        #     if n%i==0:
        #         return False
        # return True