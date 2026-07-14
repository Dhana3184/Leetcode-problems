// Last updated: 14/07/2026, 14:19:51
class Solution {
    public boolean canJump(int[] nums) {
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(i>ind){
                return false;
            }
            ind=Math.max(ind,i+nums[i]);
        }
        return true;
    }
}