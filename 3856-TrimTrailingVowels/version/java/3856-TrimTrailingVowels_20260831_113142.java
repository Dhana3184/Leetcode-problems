// Last updated: 31/08/2026, 11:31:42
1class Solution {
2    public boolean isVowel(char c){
3        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
4            return true;
5        }
6        return false;
7    }
8    public String trimTrailingVowels(String s) {
9        int ind=-1;
10        for(int i=s.length()-1;i>=0;i--){
11            if(!isVowel(s.charAt(i))){
12                ind=i;
13                break;
14            }
15        }
16        if(ind==-1){
17            return "";
18        }
19        return s.substring(0,ind+1);
20    }
21}