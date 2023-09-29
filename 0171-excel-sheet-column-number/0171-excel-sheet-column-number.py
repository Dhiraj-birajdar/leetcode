class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        c = columnTitle[::-1]
        cn = 0
        for i in range(len(c)):
            cn = cn + 26**i * (ord(c[i]) - 64)
        return cn

