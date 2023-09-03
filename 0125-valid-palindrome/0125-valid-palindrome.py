class Solution:
    def isPalindrome(self, s: str) -> bool:
        if s == '':
            return True
        
        a = list('abcdefghijklmnopqrstuvwxyz0123456789')
        s = s.lower()
        # a = list(a)
        # a.extend(list(b))
        r = ""
        for e in s:
            if e in a:
                r = r + e
        b = r[::-1]
        # print(r,b)
        return r==b