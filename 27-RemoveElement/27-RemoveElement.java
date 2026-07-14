// Last updated: 14/07/2026, 14:20:08
class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
                count++;
            }
        }
        return count;
    }
}