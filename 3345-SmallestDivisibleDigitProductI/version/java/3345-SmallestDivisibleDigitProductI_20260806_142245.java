// Last updated: 06/08/2026, 14:22:45
1class Solution {
2    public int smallestNumber(int n, int t) {
3        int prod=1;
4        int num=n;
5        while(num>0){
6            int d=num%10;
7            prod*=d;
8            num/=10;
9        }
10        if(prod%t==0){
11            return n;
12        }
13        prod=1;
14        num=n+1;
15        int res=num;
16        while(true){
17            while(num>0){
18                int d=num%10;
19                prod*=d;
20                num/=10;
21            }
22            if(prod%t==0){
23                return res;
24            }else{
25                n=n+1;
26                num=n;
27                res=num;
28                prod=1;
29            }
30        }
31    }
32}