// Last updated: 15/07/2026, 14:47:36
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
8            if(entry.getValue()==1){
9                return entry.getKey();
10            }
11        }
12        return -1;
13    }
14}