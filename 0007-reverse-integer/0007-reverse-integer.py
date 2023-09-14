class Solution:
    def reverse(self, x: int) -> int:
        s = str(x)[::-1]
        if x < 0:
            n = str(x)[::-1]
            n = n.replace(n[-1],'')
            if not(-2**31 <= int(n) <= (2**31-1)) or x==0:
                return 0
            return 0- int(n)

        n = str(x)[::-1]
        n=int(n)
        if not(-2**31 <= n <= (2**31-1)) or x==0:
            return 0
        return n
         
        

        return 0 - int(n)
        



        