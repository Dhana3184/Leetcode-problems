// Last updated: 14/07/2026, 14:18:59
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        int[] nums=new int[2];
        while(l<r){
            int sum=numbers[l]+numbers[r];
            if(sum==target){
                nums[0]=l+1;
                nums[1]=r+1;
                break;
            }else if(sum>target){
                r--;
            }else{
                l++;
            }
        }
        return nums;
    }
}