// Last updated: 23/07/2026, 15:08:23
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        s=s.toUpperCase();
4        StringBuilder sb=new StringBuilder();
5        int count=0;
6        for(int i=s.length()-1;i>=0;i--){
7            if(s.charAt(i)=='-'){
8                continue;
9            }
10            if(count==k){
11                sb.append('-');
12                count=0;
13            }
14            sb.append(s.charAt(i));
15            count++;
16        }
17        return sb.reverse().toString();
18    }
19}