class Solution:
    def numberOfSteps(self, num: int) -> int:
        s = 0
        while(num!=0):
            if num%2==0:
                num/=2
                s+=1
            else:
                num-=1
                s+=1
        return s