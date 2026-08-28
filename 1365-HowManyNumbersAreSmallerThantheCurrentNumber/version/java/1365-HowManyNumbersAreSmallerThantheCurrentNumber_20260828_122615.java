// Last updated: 28/08/2026, 12:26:15
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int[] arr=new int[nums.length];
4        for(int i=0;i<nums.length;i++){
5            int count=0;
6            for(int j=0;j<nums.length;j++){
7                if(i!=j && nums[j]<nums[i]){
8                    count++;
9                }
10            }
11            arr[i]=count;
12        }
13        return arr;
14    }
15}