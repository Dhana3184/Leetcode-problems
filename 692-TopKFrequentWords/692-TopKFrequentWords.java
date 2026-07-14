// Last updated: 14/07/2026, 14:17:15
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<String> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)->{
            if(map.get(a).equals(map.get(b))){
                return a.compareTo(b);
            }
            return map.get(b)-map.get(a);
        });
        List<String> lst=new ArrayList<>();
        for(int i=0;i<k;i++){
            lst.add(ls.get(i));
        }
        return lst;
    }
}