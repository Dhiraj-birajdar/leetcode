class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        r = 0
        for i in hours:
            if i>=target:
                r += 1
        return r