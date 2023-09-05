class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        if digits == []:
            return digits
        
        if digits[-1] < 9 :
            digits[-1] += 1
            return digits
        n = 0
        for i in digits:
            n = n*10 + i
        
        n +=1
        l = list(str(n))
        digits = []
        for e in l:
            digits.append(int(e))
        return digits