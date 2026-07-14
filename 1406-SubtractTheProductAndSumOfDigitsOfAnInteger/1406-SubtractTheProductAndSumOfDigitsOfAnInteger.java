// Last updated: 14/07/2026, 14:15:56
class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1,sum=0;
        while(n>0){
            int dig=n%10;
            prod*=dig;
            sum+=dig;
            n/=10;
        }
        return prod-sum;
    }
}