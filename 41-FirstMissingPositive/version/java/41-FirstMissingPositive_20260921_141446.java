// Last updated: 21/09/2026, 14:14:46
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Arrays.sort(nums);
4        int k=1;
5        for(int i=0;i<=nums.length-1;i++){
6            if(nums[i]==k){
7                k++;
8            }
9        }
10        return k;
11    }
12}