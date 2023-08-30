class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        f1 = False
        r = ""
        stl = []
        # for str in strs:
        #     if str == "":
        #         f1 = True
        #         break
        for str in strs:
            stl.append(len(str))
        if not f1:
            for i in range(min(stl)):
                for j in range(1,len(strs)):
                    if strs[0][i] != strs[j][i]:
                        f1 = True
                        # print(strs[0][i], strs[j][i])
                        break
                # print(f1)
                if f1:
                    break
                else:
                    r+=strs[0][i]
        return r
                

