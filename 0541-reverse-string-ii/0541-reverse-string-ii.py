class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        import math
        str = []
        r = ''
        for i in range(0,len(s),2*k):
            str.append(s[i:i+2*k])
        for s1 in str:
            r+=(s1[0:k][::-1]+s1[k:])
        return r