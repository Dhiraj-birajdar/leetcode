class Solution:
    def maximumElementAfterDecrementingAndRearranging(self, arr: list[int]) -> int:
        arr = sorted(arr)
        arr[0] = 1
        for i in range(1, len(arr)):
            if arr[i] - arr[i-1] <=1: continue
            arr[i] = arr[i-1]+1
        return max(arr)
                
                
    