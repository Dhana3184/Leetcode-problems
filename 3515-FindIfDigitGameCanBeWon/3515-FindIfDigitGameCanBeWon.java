// Last updated: 14/07/2026, 14:14:04
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singSum=0,singRem=0;
        int doubSum=0,doubRem=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                singSum+=nums[i];
            }else{
                singRem+=nums[i];
            }
        }
        if(singSum>singRem){
            return true;
        }else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]>9){
                    doubSum+=nums[i];
                }else{
                    doubRem+=nums[i];
                }
            }
        }
        if(doubSum>doubRem){
            return true;
        }
        return false;
    }
}