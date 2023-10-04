class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:

        n = set(nums)
        i = 1
        while i in n:
            i+=1
        return i
        # n = sorted(nums)
        # i = 0
        # while(n[i] <= 0): i+=1
        # for j, k in zip(range(i, len(n)), range(1,len(n))):
        #     if n[j] == k:
        #         while(n[j]==k and j < len(n)): j+=1
        #     else:
        #         return k
        # return k+1

        # if len(nums) == 1:
        #     if nums[0] <= 0:
        #         return 1
        #     elif nums[0]==1:
        #         return 2
        #     else:
        #         return 1
        # i = 0
        # for i in range(0,len(nums)):
        #     if i+1 not in nums:
        #         return i
        # return i+1

