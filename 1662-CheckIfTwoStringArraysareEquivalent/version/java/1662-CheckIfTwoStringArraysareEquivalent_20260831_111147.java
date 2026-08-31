// Last updated: 31/08/2026, 11:11:47
1class Solution {
2    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
3        StringBuilder sb1=new StringBuilder();
4        StringBuilder sb2=new StringBuilder();
5        for(String st:word1){
6            sb1.append(st);
7        }
8        for(String st:word2){
9            sb2.append(st);
10        }
11        return sb1.toString().equals(sb2.toString());
12    }
13}