// Last updated: 30/07/2026, 11:46:54
1class Solution {
2    public boolean checkValidString(String s) {
3        int min=0,max=0;
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='('){
6                min++;
7                max++;
8            }else if(s.charAt(i)==')'){
9                min--;
10                max--;
11            }else if(s.charAt(i)=='*'){
12                min--;
13                max++;
14            }
15            if(min<0){
16                min=0;
17            }
18            if(max<0){
19                return false;
20            }
21        }
22        return min==0;
23    }
24}