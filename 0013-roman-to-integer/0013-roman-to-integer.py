class Solution:
    def romanToInt(self, s: str) -> int:
        rToI = {'I':1,'V':5,'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        res = 0
        flag = True
        for i in range(len(s)-1):
            if flag:
                if(rToI[s[i]] < rToI[s[i+1]]):
                    res += (rToI[s[i+1]] - rToI[s[i]])
                    print(rToI[s[i]], rToI[s[i+1]], res)
                    flag = False
                else:
                    res+=rToI[s[i]]
                    # print(i,s[i])
            else:
                flag = True
        
        if rToI[s[len(s)-1]] > rToI[s[len(s)-2]]:
            pass
        else:
            res+=rToI[s[len(s)-1]]
        
        return res