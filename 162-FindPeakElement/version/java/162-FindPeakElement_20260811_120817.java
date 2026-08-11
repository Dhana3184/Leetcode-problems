// Last updated: 11/08/2026, 12:08:17
1class Solution {
2    public int findPeakElement(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],i);
6        }
7        Arrays.sort(nums);
8        int peak=nums[nums.length-1];
9        return map.get(peak);
10    }
11}