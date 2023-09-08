class Solution:
    def hammingWeight(self, n: int) -> int:
        s = f"{n:b}"
        
        return s.count("1")