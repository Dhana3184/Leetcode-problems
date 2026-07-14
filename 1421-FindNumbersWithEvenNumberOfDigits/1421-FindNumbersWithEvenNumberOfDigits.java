// Last updated: 14/07/2026, 14:15:52
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int len=0;
            int n=nums[i];
            while(n>0){
                int dig=n%10;
                len++;
                n/=10;
            }
            if(len%2==0){
                count++;
            }
        }
        return count;
    }
}