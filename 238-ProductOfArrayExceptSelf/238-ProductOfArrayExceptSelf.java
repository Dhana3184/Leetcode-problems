// Last updated: 14/07/2026, 14:18:25
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int leftprd=1;
        for(int i=0;i<n;i++){
            ans[i]=leftprd;
            leftprd*=nums[i];
        }
        int rightprd=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=rightprd;
            rightprd*=nums[i];
        }
        return ans;
    }
}