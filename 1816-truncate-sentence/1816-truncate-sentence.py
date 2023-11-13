class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        l = s.split()
        s = ''
        for i in range(k):
            s+=f"{l[i]} "
        return s[:-1]