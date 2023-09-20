class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # for i in nums:
        #     if nums.count(i) == 1:
        #         return i
        nums = sorted(nums)
        for i in range(0,len(nums)-1,2):
            if nums[i] != nums[i+1]:
                return nums[i]
        return nums[-1]