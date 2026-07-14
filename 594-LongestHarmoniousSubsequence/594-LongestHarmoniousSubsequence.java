// Last updated: 14/07/2026, 14:17:30
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int si=0;
        int sum=nums[si];
        int max=0;
        for(int li=1;li<nums.length;li++){
            while(nums[li]-nums[si]>1){
                si++;
            }
            if(nums[li]-nums[si]==1){
                max=Math.max(max,li-si+1);
            }
        }
        return max;
    }
}
