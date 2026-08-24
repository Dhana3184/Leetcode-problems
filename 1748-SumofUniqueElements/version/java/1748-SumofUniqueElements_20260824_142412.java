// Last updated: 24/08/2026, 14:24:12
1class Solution {
2    public int sumOfUnique(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        int sum=0;
8        for(int i=0;i<nums.length;i++){
9            if(map.get(nums[i])==1){
10                sum+=nums[i];
11            }
12        }
13        return sum;
14    }
15}