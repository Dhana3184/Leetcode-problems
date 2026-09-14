// Last updated: 14/09/2026, 23:13:58
1class Solution {
2    public String minWindow(String s, String t) {
3        if(s.length()<t.length()){
4            return "";
5        }
6        int[] freq=new int[128];
7        for(char c:t.toCharArray()){
8            freq[c]++;
9        }
10        int left=0,right=0;
11        int needed=t.length();
12        int start=0,minLen=Integer.MAX_VALUE;
13        while(right<s.length()){
14            char r=s.charAt(right);
15            if(freq[r]>0){
16                needed--;
17            }
18            freq[r]--;
19            right++;
20            while(needed==0){
21                if(right-left<minLen){
22                    minLen=right-left;
23                    start=left;
24                }
25                char l=s.charAt(left);
26                freq[l]++;
27                if(freq[l]>0){
28                    needed++;
29                }
30                left++;
31            }
32        }
33        if(minLen==Integer.MAX_VALUE){
34            return "";
35        }
36        return s.substring(start,start+minLen);
37    }
38}