class Solution:
    def romanToInt(self, s: str) -> int:
        rToI = {'I':1,'V':5,'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        res = 0
        flag = True
        for i in range(len(s)-1):
            if flag:
                if(rToI[s[i]] < rToI[s[i+1]]):
                    res += (rToI[s[i+1]] - rToI[s[i]])
                    print(rToI[s[i]], rToI[s[i+1]], res)
                    flag = False
                else:
                    res+=rToI[s[i]]
                    # print(i,s[i])
            else:
                flag = True
        
        if rToI[s[len(s)-1]] > rToI[s[len(s)-2]]:
            pass
        else:
            res+=rToI[s[-1]]
        
        return res
""" methond 1
class Solution(object):
    def romanToInt(self, s):
        roman = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        total = 0
        for i in range(len(s) - 1):
            if roman[s[i]] < roman[s[i+1]]:
                total -= roman[s[i]]
            else:
                total += roman[s[i]]
        return total + roman[s[-1]]
"""
""" methond 2
        roman = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        total = 0
        s = s.replace("IV", "IIII").replace("IX", "VIIII")
        s = s.replace("XL", "XXXX").replace("XC", "LXXXX")
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC")
        for symbol in s:
            total += roman[symbol]
        return total
"""
