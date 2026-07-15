// Last updated: 15/07/2026, 14:43:59
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq=new PriorityQueue<>();
4        for(int i=0;i<nums.length;i++){
5            pq.offer(nums[i]);
6            if(pq.size()>k){
7                pq.poll();
8            }
9        }
10        return pq.peek();
11    }
12}