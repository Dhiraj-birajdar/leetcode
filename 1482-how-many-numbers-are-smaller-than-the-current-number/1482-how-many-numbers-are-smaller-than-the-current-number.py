class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        r = []
        c = 0
        for i in range(len(nums)):
            for j in nums:
                if j < nums[i]:
                    c+=1
            r.append(c)
            c = 0
        return r

