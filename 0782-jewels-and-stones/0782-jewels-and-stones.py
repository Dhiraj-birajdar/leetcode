class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        r = 0
        for i in jewels:
            r += stones.count(i)
        return r