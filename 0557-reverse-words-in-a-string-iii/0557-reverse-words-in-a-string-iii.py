class Solution:
    def reverseWords(self, s: str) -> str:
        l = s.split(" ")
        s = ''
        for i in l:
            s+= f"{i[::-1]} "
        return s[0:-1]