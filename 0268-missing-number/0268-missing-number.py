class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        for i in range(len(nums)+1):
            try:
                nums.remove(i)
            except(ValueError):
                return i