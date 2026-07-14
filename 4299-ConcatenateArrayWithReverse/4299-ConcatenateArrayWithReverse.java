// Last updated: 14/07/2026, 14:13:36
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2*n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            count++;
        }
        for(int i=n-1;i>=0;i--){
            arr[count]=nums[i];
            count++;
        }
        return arr;
    }
}