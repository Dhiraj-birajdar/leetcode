class Solution:
    def sortSentence(self, s: str) -> str:
        d = {}
        for i in s.split():
            d[int(i[-1])] = i[:-1]
        sen = ''
        for i in range(len(d)):
            sen+=f"{d[i+1]} "
        return sen[:-1]