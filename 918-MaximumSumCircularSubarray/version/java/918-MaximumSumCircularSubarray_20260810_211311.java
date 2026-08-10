// Last updated: 10/08/2026, 21:13:11
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int total=nums[0];
4        int currSum=nums[0];
5        int currMin=nums[0];
6        int maxSum=nums[0];
7        int minSum=nums[0];
8        for(int i=1;i<nums.length;i++){
9            currSum=Math.max(nums[i],currSum+nums[i]);
10            maxSum=Math.max(currSum,maxSum);
11            currMin=Math.min(nums[i],currMin+nums[i]);
12            minSum=Math.min(currMin,minSum);
13            total+=nums[i];
14        }
15        int cir=0;
16        if(maxSum<0){
17            return maxSum;
18        }else{
19            cir=total-minSum;
20        }
21        return Math.max(cir,maxSum);
22    }
23}