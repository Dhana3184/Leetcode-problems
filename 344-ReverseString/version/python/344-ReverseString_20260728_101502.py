# Last updated: 28/07/2026, 10:15:02
1class Solution:
2    def reverseString(self, s: List[str]) -> None:
3        l=0
4        r=len(s)-1
5        while l<r:
6            s[l],s[r]=s[r],s[l]
7            l=l+1
8            r=r-1
9            
10        return s
11        