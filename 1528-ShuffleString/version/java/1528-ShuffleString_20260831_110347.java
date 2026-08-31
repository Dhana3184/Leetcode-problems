// Last updated: 31/08/2026, 11:03:47
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        char[] res=new char[s.length()];
4        for(int i=0;i<res.length;i++){
5            res[indices[i]]=s.charAt(i);
6        }
7        return new String(res);
8    }
9}