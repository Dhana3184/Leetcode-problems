// Last updated: 22/08/2026, 11:17:01
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum=0,prod=1;
4        int num=n;
5        while(num>0){
6            int dig=num%10;
7            sum+=dig;
8            prod*=dig;
9            num/=10;
10        }
11        if(n%(sum+prod)==0){
12            return true;
13        }
14        return false;
15    }
16}