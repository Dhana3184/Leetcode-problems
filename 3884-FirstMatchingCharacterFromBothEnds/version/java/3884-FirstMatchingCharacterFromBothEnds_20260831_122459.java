// Last updated: 31/08/2026, 12:24:59
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int l=0,r=s.length()-1;
4        int ind=-1;
5        while(l<=r){
6            if(s.charAt(l)==s.charAt(r)){
7                ind=l;
8                break;
9            }
10            l++;
11            r--;
12        }
13        return ind;
14    }
15}