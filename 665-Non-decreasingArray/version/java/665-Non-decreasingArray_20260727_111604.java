// Last updated: 27/07/2026, 11:16:04
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        int count=0;
4        for(int i=0;i<nums.length-1;i++){
5            if(nums[i]>nums[i+1]){
6                count++;
7                if(count>1){
8                    return false;
9                }
10                if(i==0 || nums[i-1]<=nums[i+1]){
11                    nums[i]=nums[i+1];
12                }else{
13                    nums[i+1]=nums[i];
14                }
15            }
16        }
17        return true;
18    }
19}