// Last updated: 14/07/2026, 14:18:49
class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int sum=0;
            while(n>0){
                int dig=n%10;
                sum+=dig*dig;
                n/=10;
            }
            n=sum;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}