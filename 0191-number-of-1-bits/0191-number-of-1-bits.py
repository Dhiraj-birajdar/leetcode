class Solution:
    def hammingWeight(self, n: int) -> int:
        s = f"{n:b}"
        # c = 1
        # while(n!=0)
        #     if n%2 == 1:
        #         c+=1
        #     n/=2
        # return c
        return s.count("1")