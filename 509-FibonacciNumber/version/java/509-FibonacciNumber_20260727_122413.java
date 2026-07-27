// Last updated: 27/07/2026, 12:24:13
1class Solution {
2    public int fib(int n) {
3        if(n<=1){
4            return n;
5        }
6        int n1=0;
7        int n2=1;
8        for(int i=2;i<=n;i++){
9            int third=n1+n2;
10            n1=n2;
11            n2=third;
12        }
13        return n2;
14    }
15}