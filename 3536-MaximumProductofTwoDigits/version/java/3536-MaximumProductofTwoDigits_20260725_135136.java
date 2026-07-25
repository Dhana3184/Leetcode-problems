// Last updated: 25/07/2026, 13:51:36
1class Solution {
2    public int maxProduct(int n) {
3        int first=0;
4        int second=0;
5        while(n>0){
6            int digit=n%10;
7            if(digit>first){
8                second=first;
9                first=digit;
10            }else if(digit>second){
11                second=digit;
12            }
13            n/=10;
14        }
15        return first*second;
16    }
17}