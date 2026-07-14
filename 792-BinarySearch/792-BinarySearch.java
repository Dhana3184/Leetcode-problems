// Last updated: 14/07/2026, 14:16:53
class Solution {
    public int search(int[] nums, int target) {
        int si=0,li=nums.length-1;
        int mid=0,x=0;
        while(si<=li){
            mid=(si+li)/2;
            if(nums[mid]==target){
                x=9;
                break;
            }else if(target>nums[mid]){
                si=mid+1;
            }else{
                li=mid-1;
            }
        }
        if(x==0) return -1;
        return mid;
    }
}