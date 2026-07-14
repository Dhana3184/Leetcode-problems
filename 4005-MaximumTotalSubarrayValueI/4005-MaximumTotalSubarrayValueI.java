// Last updated: 14/07/2026, 14:13:41
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return (long)k*(max-min);
    }
}