// Last updated: 14/07/2026, 14:15:02
class Solution {
    public int subsetXORSum(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            res=res | nums[i];
            
        }
        return res<<n-1;
    }
}