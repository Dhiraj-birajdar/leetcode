class Solution:
    def getWinner(self, arr: List[int], k: int) -> int:
        w = 0
        l = len(arr)
        while(True):
            if arr[0] > arr[1]:
                arr.append(arr.pop(1))
                w+=1
            else:
                arr.append(arr[0])
                arr.pop(0)
                w = 1
            if w == l or w == k:
                return arr[0]