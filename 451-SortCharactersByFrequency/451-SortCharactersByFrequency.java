// Last updated: 14/07/2026, 14:17:47
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)-> {
            return (map.get(b)-map.get(a));
        });
        StringBuilder sb=new StringBuilder();
        for(char ch:ls){
            int freq=map.get(ch);
            while(freq>0){
                sb.append(ch);
                freq--;
            }
        }
        return sb.toString();
    }
}