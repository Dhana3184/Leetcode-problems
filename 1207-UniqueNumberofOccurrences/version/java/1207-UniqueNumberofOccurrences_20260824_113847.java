// Last updated: 24/08/2026, 11:38:47
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<arr.length;i++){
5            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
6        }
7        HashSet<Integer> set=new HashSet<>();
8        for(int n:map.values()){
9            if(!set.add(n)){
10                return false;
11            }
12        }
13        return true;
14    }
15}