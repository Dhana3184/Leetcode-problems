// Last updated: 14/07/2026, 14:15:34
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[k]=sum;
            k++;
        }
        return nums;
    }
}