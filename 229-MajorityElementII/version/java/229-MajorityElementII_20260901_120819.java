// Last updated: 01/09/2026, 12:08:19
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int n=nums.length;
4        List<Integer> ls=new ArrayList<>();
5        HashMap<Integer,Integer> map=new HashMap<>();
6        for(int i=0;i<nums.length;i++){
7            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
8        }
9        for(int i=0;i<nums.length;i++){
10            if(map.get(nums[i])>(n/3) && !ls.contains(nums[i])){
11                ls.add(nums[i]);
12            }
13        }
14        return ls;
15    }
16}