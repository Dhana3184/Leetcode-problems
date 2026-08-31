// Last updated: 31/08/2026, 11:08:04
1class Solution {
2    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
3        String s1=String.join("",word1);
4        String s2=String.join("",word2);
5        if(s1.equals(s2)){
6            return true;
7        }
8        return false;
9    }
10}