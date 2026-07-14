// Last updated: 14/07/2026, 14:18:53
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen=new HashSet<>();
        HashSet<String> repeated=new HashSet<>();
        for(int i=0;i+10<=s.length();i++){
            String current=(s.substring(i,i+10));
            if(seen.contains(current)){
                repeated.add(current);
            }else{
                seen.add(current);
            }
        }
        List<String> ls=new ArrayList<>(repeated);
        return ls;
    }
}