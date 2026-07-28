# Last updated: 28/07/2026, 10:06:52
1class Solution:
2    def maximumWealth(self, accounts: List[List[int]]) -> int:
3        max=0
4        for i in range(len(accounts)):
5            wealth=0
6            for j in range(len(accounts[i])):
7                wealth+=accounts[i][j]
8            if wealth>max:
9                max=wealth
10        return max