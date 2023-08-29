class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        s = set(nums)
        # print()
        # print(len(s))
        return len(s) != len(nums)
            # return False
        # else:
            # return True