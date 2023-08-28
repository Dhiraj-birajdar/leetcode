class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        cl=[]
        rl=[]
        # s=list(s)
        r = 0
        for j in range(len(s)):
            for i in range(j,len(s)):
                if s[i] not in cl:
                    r+=1
                    cl.append(s[i])
                    # print('if ',r,cl,s[i],rl)
                else:
                    break
            rl.append(r)
            r=0
            cl.clear()
                    # break
        if s=="":
            return 0
        elif len(s)==1:
            return 1
        else:
            return max(rl)