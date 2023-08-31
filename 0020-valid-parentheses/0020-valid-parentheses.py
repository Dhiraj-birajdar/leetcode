class Solution:
    def isValid(self, s: str) -> bool:
        op = ['(','[','{']
        d = {')':'(',']':'[','}':'{'}
        cl = [')',']','}']
        s = list(s)
        if len(s)<=1:
            return False
        stack = []
        for b in s:
            if b in op:
                stack.append(b)
                # print(stack)
            elif b in cl and d[b] in stack:
                # print(stack)
                if d[b]!=stack[-1]:
                    return False
    # "{[]}"
                # print(d[b],stack[-1])
                # print("before",stack)
                stack.pop()
                # print("after",stack)
            elif b in cl and s.index(b)==0:
                return False
            else:
                return False
        if len(stack)!=0:
            return False
        # print(len(stack))
        # print(stack)
        return True