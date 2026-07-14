// Last updated: 14/07/2026, 14:19:43
class Solution {
    public int climbStairs(int n) {
        int a=0,b=1;
        int c=0;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}