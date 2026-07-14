// Last updated: 14/07/2026, 14:14:07
class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            while(n>0){
                int dig=n%10;
                sum+=dig;
                n/=10;
            }
            min=Math.min(sum,min);
        }
        return min;
    }
}