class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        # num1 = num1[::-1]
        # num2 = num1[::-1]
        n1,n2 = 0,0
        for i in num1:
            n1 = n1*10+(ord(i)-48)
        for j in num2:
            n2 = n2*10+(ord(j)-48)
        return str(n1*n2)
