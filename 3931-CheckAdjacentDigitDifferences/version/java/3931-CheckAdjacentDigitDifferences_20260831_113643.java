// Last updated: 31/08/2026, 11:36:43
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3        for(int i=0;i<s.length()-1;i++){
4            int n1=s.charAt(i)-'0';
5            int n2=s.charAt(i+1)-'0';
6            if(Math.abs(n1-n2)>2){
7                return false;
8            }
9        }
10        return true;
11    }
12}