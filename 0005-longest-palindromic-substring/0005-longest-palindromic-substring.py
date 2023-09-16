class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s)<2:
            return s
        l = s[0]
        n = len(s)
        for i in range(n):
            if len(l)>n-i:
                return l
            for j in range(i+1,n):
                s1 = s[i:j+1]
                if s1 == s1[::-1] and len(s1)>len(l):
                    l = s1
        return l