// Last updated: 14/07/2026, 14:13:59
class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int left=0,count=0;
        for(int i=0;i<nums.length-1;i++){
            left=left+nums[i];
            int right=total-left;
            if(left%2==right%2){
                count++;
            }
        }
        return count;
    }
}