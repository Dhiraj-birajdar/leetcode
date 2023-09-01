class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # f1=False
        if s=="" or t=="":
            return False
        s = sorted(list(s))
        t = sorted(list(t))
        return s==t

        