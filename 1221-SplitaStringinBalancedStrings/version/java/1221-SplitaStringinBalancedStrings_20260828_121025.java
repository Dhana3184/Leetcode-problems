// Last updated: 28/08/2026, 12:10:25
1class Solution {
2    public int balancedStringSplit(String s) {
3        int count=0;
4        int n=s.length();
5        int balance=0;
6        for(int i=0;i<n;i++){
7            if(s.charAt(i)=='L'){
8                balance--;
9            }else{
10                balance++;
11            }
12            if(balance==0){
13                count++;
14            }
15        }
16        return count;
17    }
18}