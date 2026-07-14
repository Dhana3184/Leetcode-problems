// Last updated: 14/07/2026, 14:20:03
class Solution {
    public int search(int[] nums, int target) {
        int si=0,li=nums.length-1,mid;
        while(si<=li){
            mid=(si+li)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>=nums[si]){
                if(target>=nums[si] && target<nums[mid]){
                    li=mid-1;
                }else{
                    si=mid+1;
                }
            }else{
                if(target>=nums[mid] && target<=nums[li]){
                    si=mid+1;
                }else{
                    li=mid-1;
                }
            }
        }
        return -1;
    }
}