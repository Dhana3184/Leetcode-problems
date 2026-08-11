// Last updated: 11/08/2026, 12:14:20
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int left=0;
4        int right=nums.length-1;
5        while(left<right){
6            int mid=left+(right-left)/2;
7            if(nums[mid]<nums[mid+1]){
8                left=mid+1;
9            }else if(nums[mid]>nums[mid+1]){
10                right=mid;
11            }
12        }
13        return left;
14    }
15}