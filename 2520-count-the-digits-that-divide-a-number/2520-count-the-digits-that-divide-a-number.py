class Solution:
    def countDigits(self, num: int) -> int:
        n = 0
        for i in str(num):
            if num % int(i) == 0: n+=1
        return n