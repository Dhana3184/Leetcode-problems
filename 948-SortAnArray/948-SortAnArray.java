// Last updated: 14/07/2026, 14:16:38
class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        int[] arr=new int[pq.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}