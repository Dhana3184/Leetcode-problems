// Last updated: 21/08/2026, 14:25:47
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        int len=word.length();
4        int upp=0;
5        for(int i=0;i<word.length();i++){
6            char ch=word.charAt(i);
7            if(Character.isUpperCase(ch)){
8                upp++;
9            }
10        }
11        if(upp==0){
12            return true;
13        }
14        if(upp==len){
15            return true;
16        }
17        if(upp==1 && Character.isUpperCase(word.charAt(0))){
18            return true;
19        }
20        return false;
21    }
22}