class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        rk = ['type', 'color', 'name']
        op = 0
        for l in items:
            if l[rk.index(ruleKey)] == ruleValue:
                op+=1
        return op
