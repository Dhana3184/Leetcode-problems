// Last updated: 27/07/2026, 12:04:23
1class Solution {
2    public int[] sortArray(int[] nums) {
3        /*PriorityQueue<Integer> pq=new PriorityQueue<>();
4        for(int i=0;i<nums.length;i++){
5            pq.offer(nums[i]);
6        }
7        int[] arr=new int[pq.size()];
8        for(int i=0;i<arr.length;i++){
9            arr[i]=pq.poll();
10        }
11        return arr;*/
12        Arrays.sort(nums);
13        return nums;
14    }
15}