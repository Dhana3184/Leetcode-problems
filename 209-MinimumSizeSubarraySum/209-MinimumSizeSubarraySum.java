// Last updated: 14/07/2026, 14:18:43
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=nums.length;
        int sum=0;
        int si=0;
        if(nums[si]>=target){
            min=1;
        }
        sum=nums[si];
        for(int li=1;li<nums.length;li++){
            sum=sum+nums[li];
            while(sum>=target){
                if((li-si+1)<min){
                    min=li-si+1;
                }
                sum=sum-nums[si];
                si++;
            }
        }
        if(si==0 && sum<target){
            return 0;
        }
        return min;
    }
}