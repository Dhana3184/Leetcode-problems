// Last updated: 14/07/2026, 14:18:17
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int pos=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[pos++]=nums[i];
            }
        }
        while(pos<n){
            nums[pos++]=0;
        }
    }
}