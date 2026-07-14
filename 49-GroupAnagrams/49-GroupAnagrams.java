// Last updated: 14/07/2026, 14:19:56
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String st=new String(arr);
            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(word);
        }
        return new ArrayList<>(map.values());
    }
}