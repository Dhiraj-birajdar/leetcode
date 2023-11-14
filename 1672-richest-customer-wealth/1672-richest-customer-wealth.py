class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        l = [sum(i) for i in accounts]
        return max(l)