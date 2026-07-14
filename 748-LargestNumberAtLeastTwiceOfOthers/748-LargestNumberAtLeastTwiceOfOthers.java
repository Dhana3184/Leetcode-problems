// Last updated: 14/07/2026, 14:16:57
class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int ind=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                ind=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=ind && nums[i]*2>max){
                return -1;
            }
        }
        return ind;
    }
}