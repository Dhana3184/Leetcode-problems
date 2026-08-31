// Last updated: 31/08/2026, 11:43:07
1class Solution {
2    public boolean areOccurrencesEqual(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        for(int i=0;i<s.length();i++){
5            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
6        }
7        int val=map.get(s.charAt(0));
8        for(int n:map.values()){
9            if(n!=val){
10                return false;
11            }
12        }
13        return true;
14    }
15}