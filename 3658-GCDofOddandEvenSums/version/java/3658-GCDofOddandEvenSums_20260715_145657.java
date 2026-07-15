// Last updated: 15/07/2026, 14:56:57
1class Solution {
2    public static int gcd(int odd,int even){
3        while(even!=0){
4            int temp=even;
5            even=odd%even;
6            odd=temp;
7        }
8        return odd;
9    }
10    public int gcdOfOddEvenSums(int n) {
11        int odd=n*n;
12        int even=n*(n+1);
13        int res=gcd(odd,even);
14        return res;
15    }
16}