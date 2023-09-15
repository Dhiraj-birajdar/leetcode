class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        
        nums1.extend(nums2)
        l = sorted(nums1)
        nl = len(l)
        if nl%2!=0:
            # print("odd",l)
            return l[int(nl/2)]
        # print("even",l)
        return (l[int(nl/2)]+l[int(nl/2)-1])/2