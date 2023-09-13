class Solution:
    def majorityElement(self, nums: list[int]) -> int:         
        d={}
        while nums!=[]:
            if nums[-1] in d:
                d[nums[-1]]+=1
            else:
                d[nums[-1]]=1
            nums.pop()
        # print(d)
        a = list(d.keys())[0]
        for e in d:
            if d.get(a) < d[e]:
                a=e
        return a