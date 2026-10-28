// Last updated: 28/10/2026, 09:24:30
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int i=0,j=0;
6        while(i<g.length && j<s.length){
7            if(s[j]>=g[i]){
8                i++;
9                j++;
10            }else{
11                j++;
12            }
13        }
14        return i;
15    }
16}