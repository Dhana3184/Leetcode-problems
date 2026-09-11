// Last updated: 11/09/2026, 11:15:28
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int closest=nums[0]+nums[1]+nums[2];
6        for(int i=0;i<n-2;i++){
7            int left=i+1,right=n-1;
8            while(left<right){
9                int sum=nums[i]+nums[left]+nums[right];
10                if(Math.abs(sum-target)<Math.abs(closest-target)){
11                    closest=sum;
12                }else if(sum>target){
13                    right--;
14                }else if(sum<target){
15                    left++;
16                }else{
17                    return sum;
18                }
19            }
20        }
21        return closest;
22    }
23}