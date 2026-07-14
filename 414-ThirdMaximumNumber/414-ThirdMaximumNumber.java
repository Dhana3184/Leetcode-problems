// Last updated: 14/07/2026, 14:17:54
class Solution {
    public int thirdMax(int[] nums) {
        long f=Long.MIN_VALUE;
        long s=Long.MIN_VALUE;
        long t=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            long n=nums[i];
            if(n>f){
                t=s;
                s=f;
                f=n;
            }else if(n>s && n!=f){
                t=s;
                s=n;
            }else if(n>t && n!=s && n!=f){
                t=n;
            }
        }
        return t==Long.MIN_VALUE?(int)f:(int)t;
    }
}