// Last updated: 07/08/2026, 14:17:08
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String st=s+s;
4        return st.substring(1,st.length()-1).contains(s);
5    }
6}