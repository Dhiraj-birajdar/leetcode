class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        l = []
        i = 0
        for s in sentences:
            l.append(len(s.split(' ')))
            i+=1
        return max(l)