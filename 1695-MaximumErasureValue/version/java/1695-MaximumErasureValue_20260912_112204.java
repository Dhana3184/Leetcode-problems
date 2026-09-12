// Last updated: 12/09/2026, 11:22:04
1class Solution {
2    public int maximumUniqueSubarray(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        int left=0,max=0,sum=0;
5        for(int right=0;right<nums.length;right++){
6            while(set.contains(nums[right])){
7                set.remove(nums[left]);
8                sum-=nums[left];
9                left++;
10            }
11            set.add(nums[right]);
12            sum+=nums[right];
13            max=Math.max(max,sum);
14        }
15        return max;
16    }
17}