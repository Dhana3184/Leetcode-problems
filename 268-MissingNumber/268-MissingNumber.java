// Last updated: 14/07/2026, 14:18:19
class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=i^nums[i];
        }
        return xor^nums.length;
    }
}