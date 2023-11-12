class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        r = ""
        for i in range(len(s)):
            r+=s[indices.index(i)]
        return r