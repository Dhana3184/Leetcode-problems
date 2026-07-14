// Last updated: 14/07/2026, 14:20:01
class Solution {
    public int searchInsert(int[] nums, int target) {
        int si=0,li=nums.length-1,mid;
        while(si<=li){
            mid=(si+li)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                si=mid+1;
            }else{
                li=mid-1;
            }
        }
        return si;
    }
}
