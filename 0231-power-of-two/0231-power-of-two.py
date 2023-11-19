class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        # return n and not(n&n-1)
        for i in range(int(n/2)+1):
            if 2**i==n: return True
            if 2**i > n: return False