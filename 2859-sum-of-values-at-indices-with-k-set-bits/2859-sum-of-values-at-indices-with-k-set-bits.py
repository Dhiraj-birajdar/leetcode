class Solution:
    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        s = 0
        for i in range(len(nums)):
            if k == str(bin(i)).count("1"):
                s+=nums[i]
        return s
