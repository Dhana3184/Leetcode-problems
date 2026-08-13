// Last updated: 13/08/2026, 11:28:58
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] s1=version1.split("\\.");
4        String[] s2=version2.split("\\.");
5        int length=Math.max(s1.length,s2.length);
6        for(int i=0;i<length;i++){
7            int n1=(i<s1.length)?Integer.parseInt(s1[i]):0;
8            int n2=(i<s2.length)?Integer.parseInt(s2[i]):0;
9            if(n1<n2){
10                return -1;
11            }else if(n1>n2){
12                return 1;
13            }
14        }
15        return 0;
16    }
17}