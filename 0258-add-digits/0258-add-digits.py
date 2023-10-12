class Solution:
    def addDigits(self, num: int) -> int:
        while(True):
            if num < 10: return num
            num = sum([int(i) for i in str(num)])
