// Last updated: 27/07/2026, 12:17:36
1class Solution {
2    public int maxProduct(int[] nums) {
3        Arrays.sort(nums);
4        int prod=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
5        return prod;
6    }
7}