// Last updated: 14/07/2026, 14:14:32
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int leftSum=0,rightSum=0;
            if(i==0){
                leftSum+=0;
            }else{
                for(int j=i-1;j>=0;j--){
                    leftSum+=nums[j];
                }
            }
            if(i==nums.length-1){
                rightSum+=0;
            }else{
                for(int k=i+1;k<=nums.length-1;k++){
                    rightSum+=nums[k];
                }
            }
            arr[i]=Math.abs(leftSum-rightSum);
        }
        return arr;
    }
}