// Last updated: 16/09/2026, 15:46:15
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        /*for(int i = 1; i < nums.length; i++) {
4            for(int j = 0; j + i < nums.length; j++) {
5                if(nums[i + j] + nums[j] == target) {
6                    return new int[]{j, i + j};
7                }
8            }
9        }
10        return new int[]{-1, -1};*/
11        List<Integer> ls=new ArrayList<>();
12        for(int i=0;i<nums.length;i++){
13            for(int j=i+1;j<nums.length;j++){
14                if(nums[i]+nums[j]==target){
15                    ls.add(i);
16                    ls.add(j);
17                    break;
18                }
19            }
20        }
21        int[] arr=new int[ls.size()];
22        for(int i=0;i<arr.length;i++){
23            arr[i]=ls.get(i);
24        }
25        return arr;
26    }
27}