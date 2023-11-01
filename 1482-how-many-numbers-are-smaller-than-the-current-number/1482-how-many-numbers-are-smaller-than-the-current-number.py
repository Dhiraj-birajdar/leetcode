class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        r = []
        for i in range(len(nums)):
            c = 0
            for j in nums:
                if j < nums[i]:
                    c+=1
            r.append(c)
        return r

