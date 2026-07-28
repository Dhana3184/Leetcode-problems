# Last updated: 28/07/2026, 09:55:49
1class Solution:
2    def runningSum(self, nums: List[int]) -> List[int]:
3        for i in range(1,len(nums)):
4            nums[i]=nums[i]+nums[i-1]
5        return nums
6        