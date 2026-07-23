// Last updated: 23/07/2026, 11:46:12
1class Solution {
2    public String customSortString(String order, String s) {
3        int[] freq=new int[26];
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            freq[ch-'a']++;
7        }
8        StringBuilder sb=new StringBuilder();
9        for(int i=0;i<order.length();i++){
10            char ch=order.charAt(i);
11            while(freq[ch-'a']>0){
12                sb.append(ch);
13                freq[ch-'a']--;
14            }
15        }
16        for(int i=0;i<26;i++){
17            while(freq[i]!=0){
18                sb.append((char)(i+'a'));
19                freq[i]--;
20            }
21        }
22        return sb.toString();
23    }
24}