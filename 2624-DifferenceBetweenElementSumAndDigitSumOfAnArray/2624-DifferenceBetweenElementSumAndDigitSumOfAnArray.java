// Last updated: 14/07/2026, 14:14:34
class Solution {
    public int differenceOfSum(int[] nums) {
        int Elesum=0;
        int digSum=0;
        for(int i=0;i<nums.length;i++){
            Elesum+=nums[i];
            int n=nums[i];
            while(n>0){
                int dig=n%10;
                digSum+=dig;
                n/=10;
            }
        }
        return Math.max(Elesum,digSum)-Math.min(Elesum,digSum);
        

    }
}