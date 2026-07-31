// Last updated: 31/07/2026, 12:22:13
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
6    }
7}