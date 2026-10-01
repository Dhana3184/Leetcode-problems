// Last updated: 01/10/2026, 11:22:35
1class Solution {
2    public int findFinalValue(int[] nums, int original) {
3        for(int i=0;i<nums.length;i++){
4            boolean found=false;
5            for(int j=0;j<nums.length;j++){
6                if(nums[j]==original){
7                    original=2*nums[j];
8                    found=true;
9                }
10            }
11            if(!found){
12                break;
13            }
14    
15        }
16        return original;
17    }
18}