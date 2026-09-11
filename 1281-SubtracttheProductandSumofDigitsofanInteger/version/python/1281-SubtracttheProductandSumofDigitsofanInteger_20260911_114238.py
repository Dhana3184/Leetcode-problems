# Last updated: 11/09/2026, 11:42:38
1class Solution:
2    def subtractProductAndSum(self, n: int) -> int:
3        prod=1
4        sum=0
5        while n>0:
6            dig=n%10
7            prod=prod*dig
8            sum=sum+dig
9            n=n//10
10        return prod-sum
11    
12        