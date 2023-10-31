class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        import re
        x = 0
        s = re.sub("[\[\]\,\ ]", '', str(nums))
        for i in s:
            x+=int(i)
        return sum(nums) - x